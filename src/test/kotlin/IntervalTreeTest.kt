import interval_tree.IntervalTree
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class IntervalTreeTest {
    private val intervalTree = IntervalTree()

    @Test
    @DisplayName("create interval tree")
    @kotlin.ExperimentalStdlibApi
    fun test100() {
        intervalTree.createTree(-5, 10, 0)
        intervalTree.intervalTree.forEach{
            println(it)
        }
    }
}