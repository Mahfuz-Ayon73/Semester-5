file_path = 'log_file.txt'

# str = ""

start = [] 

second = []

end_ckpt_indices = []

undo_list = []

redo_list = []

count = 0

index = -1

with open(file_path) as f:
    for line in f:
        content = line
        start.append(content)

print()

# Output the logs after the second-to-last 'END CKPT'
print("Logs after second-to-last END CKPT:")

print(start)

for i in range(len(start) - 1 , -1, -1):
    if "END CKPT" in start[i]:
        count = count + 1
    if count == 2 : 
        index = i
        break
     
print(count , index)

for i in range(0,len(start)-index-1):
    second.append(start[i+index+1])

print(second,end='\n')
# redo list
# for item in reversed(start):
#     if 'COMMIT' in item:
#         index = item.rfind("T")
#         transaction = item[index : index+2]

#        # print(transaction)

#         str = '<' + transaction

#         new_value = ""
#         old_value = ""
#         element = ""
        
#         # print(str)
#         for ele in start:
#             if str in ele:
#                 element += ele[4]
#                 for i in range(6,len(ele)-2):
#                     if ele[i+1] == " " :
#                         old_value += ele[i]
#                         new_index = i+2
#                         break
#                     else : old_value += ele[i]
                
#                 for i in range(new_index , len(ele)-1):
#                     if ele[i+1] == '>':
#                         new_value += ele[i]
#                         break
#                     else:
#                         new_value += ele[i]

#         # print(element,old_value,new_value) 

#         redo_list.append([transaction,element,old_value,new_value])  

#         start.remove(item)   

#     # print(transaction)
#     for i in start : 
#         if transaction in i:
#            start.remove(i)

# # print("REDO list") 
# # print(redo_list)

# # # print(start)

# # print("UNDO list")

# # undo list

# for item in reversed(start):
        
#         index = item.rfind("T")
#         transaction = item[index : index+2]

#         str = '<' + transaction

#         new_value = ""
#         old_value = ""
#         element = ""
        
#         # print(str)
#         for ele in start:
#             if str in ele:
#                 element += ele[4]
#                 for i in range(6,len(ele)-2):
#                     if ele[i+1] == " " :
#                         old_value += ele[i]
#                         new_index = i+2
#                         break
#                     else : old_value += ele[i]
                
#                 for i in range(new_index , len(ele)-1):
#                     if ele[i+1] == '>':
#                         new_value += ele[i]
#                         break
#                     else:
#                         new_value += ele[i]

#         # print(transaction,element,old_value,new_value) 

#         undo_list.append([transaction,element,old_value,new_value])  


# # print(undo_list)