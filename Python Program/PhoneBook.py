phone_book = {}

def add_new_phone_number(phonebook, name, phonenumber):
    if len(phonenumber) == 10:
        if name in phonebook:
            phonebook[name].append(phonenumber)
        else:
            phonebook[name] = [phonenumber]
        print(f"Added {name} : {name}'s phone number : {phonenumber}")
    else:
        print("Input phone number is invalid. It should be 10 digits.")

def search_name(phonebook, name):
    if name in phonebook:
        phone_numbers = phonebook[name]
        for number in phone_numbers:
            print(f"{name} : {name}'s phone number : {number}")
    else:
        print(f"{name} is not in the phonebook")

def delete_name(phonebook, name):
    if name in phonebook:
        del phonebook[name]
        print(f"Deleted {name} : {name}'s phone number : from the phonebook.")
    else:
        print(f"{name} is not in the phonebook, so there's nothing to delete.")

def display_all(phonebook):
    print("\nPhonebook Contents:")
    for name, phone_numbers in phonebook.items():
        print(f"Name: {name}\nPhone numbers: {', '.join(phone_numbers)}")


while True:
    print("\nPhonebook Menu:")
    print("1. Add a new phone number")
    print("2. Search for a name")
    print("3. Delete a name")
    print("4. Display all contents")
    print("5. Exit")

    choice = input("Enter your choice (1/2/3/4/5): ")

    if choice == "1":
        name = input("Enter the name: ")
        phonenumber = input("Enter the phone number: ")
        add_new_phone_number(phone_book, name, phonenumber)
    elif choice == "2":
        name_to_find = input("Enter the name to search: ")
        search_name(phone_book, name_to_find)
    elif choice == "3":
        name_to_delete = input("Enter the name to delete: ")
        delete_name(phone_book, name_to_delete)
    elif choice == "4":
        display_all(phone_book)
    elif choice == "5":
        print("Exiting the phonebook program. Goodbye!")
        break
    else:
        print("Invalid choice. Please enter 1, 2, 3, 4, or 5.")
