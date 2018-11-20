# spring-mvc

basic rest api

Deployed in heroku 
 https://obscure-depths-36332.herokuapp.com/api/v1/customers/
  
Testing using postman 
-find all customers
 get  https://obscure-depths-36332.herokuapp.com/api/v1/customers/
  
-find customer on id 
 get  https://obscure-depths-36332.herokuapp.com/api/v1/customers/{id}
 
-add new customer 
 post https://obscure-depths-36332.herokuapp.com/api/v1/customers/ 
 Content-Type →application/json;
 charset=UTF-8
 body row
 {
  firstname : "Jone",
  lastname : "Medore"
 }
