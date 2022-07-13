class Employee:
    def __init__(self, name, empId, pay):
        self.name = name
        self.empId = empId
        self.pay = pay


print("                 *")
print("               *   *")
print("             *   *   *")
print("           *   *   *   *")
print("         *   *   *   *   *")
print("       *   *   *   *   *   *")
print("*****WELCOME TO EMPLOYEE PORTAL*****")

employeeList = []

chances = 5
while chances >= 0:
    username = str(input("Enter your username: "))
    if username == "username":
        chances1 = 3
        while chances1 >= 0:
            password = str(input("Enter your password: "))
            if password == "password":
                print("You have successfully logged in.")
                while True:
                    print("\n1. Add Employee\n2. Show list of Employee\n3. Exit\n")
                    choice = int(input("Enter your choice: "))
                    if choice == 1:
                        numberOfEmployee = int(
                            input("Enter the number of employee you want to add: "))
                        for i in range(numberOfEmployee):
                            if i in range(0, 10):
                                employeeId = "A00" + str(i)
                            elif i in range(10, 100):
                                employeeId = "A0" + str(i)
                            elif i in range(100, 1000):
                                employeeId = "A" + str(i)
                            print("Employee :", i)
                            print("\tEmployee no.: ", employeeId)
                            employeeName = str(input("\tName: "))
                            employeePay = int(input("\tPay: "))
                            employeeList.append(Employee(employeeName, employeeId, employeePay))
                    elif choice == 2:
                        sorted_list = sorted(employeeList, key=lambda x: x.name)
                        for i in sorted_list:
                            print(f"Employee ID: {i.empId}\nName: {i.name}\nPay: {str(i.pay)}\n")
                        print("\n")
                    elif choice == 3:
                        break
                    else:
                        print("Invalid option")
                break
            else:
                print("You entered incorrect password")
                chances1 = chances1 - 1
                if chances1 == 0:
                    print("\nNo more tries")
                    break
        break
    else:
        print("Try again...")
        chances = chances - 1
        if chances == 0:
            print("\nNo more tries")
            break
