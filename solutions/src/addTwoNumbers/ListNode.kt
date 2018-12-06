package addTwoNumbers


class ListNode(var `val`: Int = 0) {
    var next: ListNode? = null

    companion object Factory {
        fun create(intArray: IntArray): ListNode {
            val firstNode = ListNode(intArray[0])
            var currentNode = firstNode
            for (i in 1 until intArray.size){
                currentNode.next = ListNode(intArray[i])
                currentNode = currentNode.next!!
            }
            return firstNode
        }

        fun create(value: Int): ListNode {
            val firstNode = ListNode(value.rem(10))
            var currentNode = firstNode
            var currentValue = value / 10
            while(currentValue > 0) {
                currentNode.next = ListNode(currentValue.rem(10))
                currentNode = currentNode.next!!
                currentValue /= 10
            }
            return firstNode
        }
    }

    fun contentEquals(other : ListNode?) : Boolean {
        if(`val` == other?.`val`){
            if(next != null && other.next != null)
            {
                return next!!.contentEquals(other.next)
            }
            else if(next == null && other.next == null){
                return true
            }
        }
        return false
    }


}