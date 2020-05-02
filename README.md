GraphQL API with Spring Boot
---
This sample application is developed to understand basic concepts of GraphQL. In memory H2 database was used for storage.

####Learning Materials:
- https://graphql.org/learn/
- https://www.baeldung.com/spring-graphql

####Queries
##### Query by employee ID
 ````
query {
    employee(employeeId: 1){
      firstName
    }
}
````
#####Query by first name
````
query {
    employeeByFirstName(firstName: "E"){
        employeeId
        firstName
        lastName
    }
}
````
---
####Mutations
#####Add new employee   
````
mutation{
    addEmployee(employeeId: 1, firstName: "G", lastName: "U", department: "WM"){
        firstName
    }
}
````