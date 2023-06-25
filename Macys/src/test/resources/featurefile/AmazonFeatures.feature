Feature:This project aims at developing a Page Object Model framework and being able
  to use this framework to login and buy a product from www.amazon.com

  @C1
  Scenario: Problem Statement 1:
  Given Search for ‘Mobile Phone’ on the ‘amazon.com’ homepage.
  When Fetch all the mobile phones listed in the product listing page along with their prices
  And and output them to an excel file and store them inside folder ‘testresult’ in ‘src-test-resources’

    @C2
Scenario: Problem Statement 2:
Given Do login and validate if Login is successful.
When Search for ‘iPhone 12’ and select a 64GB phone on product details page after selecting the phone from product listing page.
And Add the product to cart and validate if the product added and available in Cart.
And Add a new address for shipping and proceed to checkout page then validate it.
And Same test to be repeated on Chrome browser (assuming you’re using Firefox as default browser else vice-versa).
And Any actions in any page are welcome (like sorting the products in product listing page, page header assertions in each page to validate if on right page, etc).