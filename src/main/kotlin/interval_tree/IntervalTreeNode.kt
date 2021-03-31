package interval_tree

data class IntervalTreeNode(
        var left: Int,
        var right: Int,
        var mid: Int,
        var cover: Boolean = false,
        var leave: Boolean = false,
) {
    override fun toString(): String {
        return if (left != right) "[${left}, ${right}) Leave: $leave"
                else ""
    }
}