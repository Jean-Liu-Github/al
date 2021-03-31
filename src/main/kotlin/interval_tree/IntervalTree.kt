package interval_tree

class IntervalTree {
    lateinit var intervalTree: Array<IntervalTreeNode>

    fun createTree(left: Int, right: Int, num: Int) {
        intervalTree = Array((right - left).times(4)) {
            IntervalTreeNode(left = 0, right = 0, mid = 0)
        }

        create(left, right, num)
    }

    fun pushNode(num: Int) {
        TODO()
    }

    private fun create(left: Int, right: Int, num: Int) {
        intervalTree[num].let {
            it.left = left
            it.right = right
            it.mid = (left + right) / 2
        }

        //非叶子节点
        if(left + 1 < right) {
            create(left, intervalTree[num].mid, 2 * num + 1)
            create(intervalTree[num].mid, right, 2 * num + 2)
        } else {
            intervalTree[num].leave = true
        }
    }

}