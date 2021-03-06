package algorithm;

import java.util.*;

/**
 * Created by gyl on 17-4-20.
 */
public class Execute {
    //扩展节点数
    public int nodeNumber;
    private HashSet<Integer> nodes= new HashSet<Integer>();
    private ArrayList<EightPuzzle> open = new ArrayList<EightPuzzle>();
    private ArrayList<EightPuzzle> close = new ArrayList<EightPuzzle>();

    public int getNodeNumber() {
        return nodeNumber;
    }

    public void setNodeNumber(int nodeNumber) {
        this.nodeNumber = nodeNumber;
    }

    /**
     * 宽度优先算法
     * @param start
     * @param target
     * @return
     */
    public ArrayList<int[]> BreadthFirst(EightPuzzle start, EightPuzzle target) {
        //节点N
        EightPuzzle nodeN = new EightPuzzle();
        //把初始节点加入到hashset中
        nodes.add(start.getCode());
        //把初始节点从OPEN表中拿出放入CLOSE表
        open.add(start);
        //记录已扩展节点数
        nodeNumber = 0;
        //判断OPEN表是否为空 若不为空，则把OPEN表中第一个元素拿入CLOSE表
        while(!open.isEmpty()) {
            //节点N从CLOSE拿入到OPEN中
            close.add(open.get(0));
            nodeN = open.remove(0);
            System.out.println("###第 "+(nodeNumber++)+" 个节点扩展###第 "+nodeN.getDepth()+" 层###");
            //判断节点N能否扩展 并把扩展后的节点放入OPEN表
            for (Direction direction : Direction.values()) {
                if (nodeN.couldMove(direction)) {
                    EightPuzzle temp = nodeN.move(direction);
                    //如果该节点已存在过，则跳过该节点
                    if (nodes.add(temp.getCode())) {
                        if (temp.isTarget(target)) {
                            System.out.println("Success, the route is below:");
                            return temp.printRoute();//返回存有路线上所有节点的ArrayList
                        } else {
                            open.add(temp);
                        }
                    }
                }
            }
        }
        System.out.println("Open is empty,failed");
        return null;
    }

    /**
     * 深度优先算法
     * @param start
     * @param target
     * @return
     */
    public ArrayList<int[]> DepthFirst(EightPuzzle start, EightPuzzle target) {
        //存取可扩展节点
        ArrayList<EightPuzzle> extend = new ArrayList<EightPuzzle>();
        //存在当前界中 存在的目标节点 用于后来比较
        ArrayList<EightPuzzle> R = new ArrayList<EightPuzzle>();
        //设置初始深度和 深度增加值
        int depthMax = 4;
        int detDeth = 8;
        EightPuzzle nodeN = new EightPuzzle();
        nodes.add(start.getCode());
        open.add(start);
        //判断OPEN表是否为空 若不为空，则把OPEN表中第一个元素拿入CLOSE表
        nodeNumber = 0;
        while (!open.isEmpty()) {
            close.add(open.get(0));
            nodeN = open.remove(0);
            if (nodeN.getDepth() > depthMax) {
                extend.add(nodeN);
            } else {
                System.out.print("###第 "+(nodeNumber++)+" 个节点扩展###第 "+nodeN.getDepth()+" 层###");
                //判断节点N能否扩展 并把扩展后的节点放入OPEN表
                for (Direction direction : Direction.values()) {
                    if (nodeN.couldMove(direction)) {
                        EightPuzzle temp = nodeN.move(direction);
                        if (nodes.add(temp.getCode())) {
                            if (temp.isTarget(target)) {
                                //如果就是目标节点  放入R列表中 且最大深度值变为该目标节点的深度
                                depthMax = temp.getDepth();
                                R.add(0,temp);
                                nodes.remove(temp);
                            } else {
                                open.add(0, temp);
                            }
                        }
                    }
                }
            }
            //如果OPEN表为空  且未找到目标节点，则继续增加深度
            if (open.isEmpty()) {
                if (!R.isEmpty()) {
                    System.out.println("Success, the route is below:");
                    return R.get(0).printRoute();//第一个解必定是深度最短的
                } else if (open.addAll(extend)) {
                    extend.clear();
                    depthMax += detDeth;
                    detDeth = detDeth / 2 + 1;//深度变化值减半+1，到后面逐渐向宽度优先靠近
                } else {
                    System.out.println("failed, there is no any node in OPEN or EXTEND");
                    return null;
                }
            }
        }
        return null;
    }

    /**
     * A*算法
     * @param start
     * @param target
     * @return
     */
    public ArrayList<int[]> AStar(EightPuzzle start, EightPuzzle target) {
        ArrayList<EightPuzzle> sonsOfN = new ArrayList<EightPuzzle>();
        EightPuzzle nodeN = new EightPuzzle();
        nodes.add(start.getCode());
        //把初始节点从OPEN表中拿出放入CLOSE表
        open.add(start);
        //判断OPEN表是否为空 若不为空，则把OPEN表中第一个元素拿入CLOSE表
        nodeNumber = 0;
        while(!open.isEmpty()) {
            close.add(open.get(0));
            nodes.add(open.get(0).getCode());//将CLOSE表中元素仍入哈希表
            nodeN = open.remove(0);
            System.out.print("###第 " + (nodeNumber++) + " 个节点扩展###第 " + nodeN.getDepth() + " 层###");
            //判断节点N能否扩展 并把扩展后的节点放入OPEN表
            for (Direction direction : Direction.values()) {
                if (nodeN.couldMove(direction)) {
                    EightPuzzle temp = nodeN.move(direction);
                    if (!nodes.contains(temp.getCode())) {//如果不在CLOSE中
                        if (temp.isTarget(target)) {
                            System.out.println("Success, the route is below:");
                            return temp.printRoute();
                        } else {
                            temp.countFValue(target);
                            sonsOfN.add(temp);
                        }
                    }
                }
            }
            //若有节点，则放入OPEN表中
            if (sonsOfN.size() >= 1) {
                open.addAll(sonsOfN);
                sonsOfN.clear();
            }
            //对OPEN表排序
            Collections.sort(open, new Comparator<EightPuzzle>() {
                @Override
                public int compare(EightPuzzle o1, EightPuzzle o2) {
                    return o1.getFvalue() - o2.getFvalue();
                }
            });
        }
        System.out.println("Open is empty,failed");
        return null;
    }
}
