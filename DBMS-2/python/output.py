import main as mn

redo_list = set(tuple(inner_list) for inner_list in mn.redo_list) 

undo_list = set(tuple(inner_list) for inner_list in mn.undo_list)

print(redo_list)

print(undo_list)

#QUESTION A

# redo 

print('a',end=': ')
for item in redo_list:
    print(item[0],end=',')

print()

#b
print('b',end=': ')
for item in undo_list:
    print(item[0],end=',')

#c 
print()

log_list = []

redo_element = []

undo_element = []

for item in redo_list:
     redo_element.append([item[1],'',item[3]])


for item in undo_list:
     undo_element.append([item[1],item[2],''])

redo_element.sort()

undo_element.sort()

print('c')
print("------Redo------|------undo------")

# print(undo_element)

for i in undo_element:
     print(i)

for i in redo_element:
      print(i)

    








