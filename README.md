# EcommerceWebsite
Built e-commerce website based on Angular front-end and SpringBoot backend

## Configuration
### Database
1. You have installed MySQL database
2. In the `./starter-files/db-scripts`, you need to execute SQL scripts to create tables and store relevant data in it.

## How to run backend and frontend app
1. SprintBoot backend, open `./backend/sprint-boot-ecommerce` through IntelliJ IDEA (JAVA IDE), the first time when you open it, the IDE will automatically execute maven reloading file to configure JAVA environment. Then run `./src/main/java/com/luv2code/ecommerce/SpringBootEcommerceApplication.java` to start backend application. (You have to ensure port 9090 is available)
2. Angular frontend: open `./frontend/angular-ecommerce` through VS code (or any terminal/bash/zsh), enter `ng serve` to start frontend application (Please ensure the system port 4200 is available)
3. Open `localhost:4200/products` in your browser to start you shopping journey!


## Function description
### product list and search
- There are 4 different category products. You can choose each of them through left sidebar. 
- You can search through keywords in the search bar to get matched products.

### Shopping cart
- You can add products to shopping cart which will help you calculate the total number of products and total amount of money you need to spend.
- After clicking your shopping cart, it will display the product details in you cart.

### Checkout form
- When you end up shopping and plan to check out. Click checkout button and enter the checkout form to populate you personal information to place this order
- There are form paste function to help you populate the same address automatically, and drop-down menu to choose country and states.
- This order including all the info will be stored in our database
- Click purchse to complete this order with order tracking number return by backend, and then we will reset shopping cart state for next shopping.

## Demo pictures
Please move to `./demo-pictures`

## Disclaimer
If you have any question about this project, please e-mail me (yt2093)
