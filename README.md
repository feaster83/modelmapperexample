# ModelMapper example

Example project to demonstrate how easy it is to map objects with [ModelMapper](http://modelmapper.org) and [Lombok](https://projectlombok.org).

### Note:
Lombok requires to install a Lombok IDE plugin to compile in the code. You can also compile it with Maven: *mvn compile* (doesn't require any additional plugin) 

## Console output 
```
# Original user
User(id=1, firstName=Jasper, lastName=Huzen, bankAccount=BankAccount(bank=Bank(name=Rabobank), accountNumber=1209661234, accountType=TYPE2))
>>> Original user converted to TO object
UserDTO(id=1, firstName=Jasper, bankAccountNumber=1209661234, bankAccountType=TYPE2, bankName=Rabobank, fullName=Jasper Huzen)
<<< TO object converted back to User object
User(id=1, firstName=Jasper, lastName=null, bankAccount=BankAccount(bank=null, accountNumber=1209661234, accountType=TYPE2))
```
