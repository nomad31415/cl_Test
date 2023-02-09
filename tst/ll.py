class  Node:
	def __init__(self,  data):
		self.data = data
		self.next = None




class LL:
	def __init__(self):
		self.head = None



	def printList(self):
		tmp = self.head
		while(tmp):
			print(tmp.data)
			tmp = tmp.next


if __name__ == '__main__':
	llist = LL()
	first = Node(1)

	llist.head  = first
	second = Node(2)
	third = Node(3)

	llist.head.next = second
	second.next = third

	llist.printList()
