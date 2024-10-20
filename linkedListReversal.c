/**
 * /**
 * ALGORITHM linkedListReversal(head)
 *  head: the head node of the linked list
 *      reverses the order of nodes in the list
 *  prev <- NULL
 *  current <- head
 *  next <- NULL
 *  while current is not NULL do
 *      next <- current->next    // stores the next node
 *      current->next <- prev    // reverses the pointer of the current node
 *      prev <- current          // moves prev to the current node
 *      current <- next          // moves to the next node
 *  head <- prev                 // sets the new head of the reversed list
 *  return head
 */

