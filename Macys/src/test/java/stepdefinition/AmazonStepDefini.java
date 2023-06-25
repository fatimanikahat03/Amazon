package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.*;

import java.io.IOException;

public class AmazonStepDefini {


    @When("Fetch all the mobile phones listed in the product listing page along with their prices")
    public void fetchAllTheMobilePhonesListedInTheProductListingPageAlongWithTheirPrices() throws InterruptedException, IOException {
        SearchItemDetails.allProuductListing();
    }




    @And("and output them to an excel file and store them inside folder ‘testresult’ in ‘src-test-resources’")
    public void andOutputThemToAnExcelFileAndStoreThemInsideFolderTestresultInSrcTestResources() throws IOException {
        SearchItemDetails.storeinExcel();
    }

    @Given("Do login and validate if Login is successful.")
    public void doLoginAndValidateIfLoginIsSuccessful() {

HomePage.hom();
LoginPage.loginusername();
LoginPage.passs();
    }

    @When("Search for ‘iPhone {int}’ and select a {int}GB phone on product details page after selecting the phone from product listing page.")
    public void searchForIPhoneAndSelectAGBPhoneOnProductDetailsPageAfterSelectingThePhoneFromProductListingPage(int arg0, int arg1) throws InterruptedException {
HomePage.searchIphone();
SearchItemDetails.six4gb();
    }

    @And("Add the product to cart and validate if the product added and available in Cart.")
    public void addTheProductToCartAndValidateIfTheProductAddedAndAvailableInCart() throws InterruptedException {
        Iphone.iPhoneSelect();
    }

    @And("Add a new address for shipping and proceed to checkout page then validate it.")
    public void addANewAddressForShippingAndProceedToCheckoutPageThenValidateIt() throws InterruptedException {
        Account.accountDetails();
        Account.Addressselect();
        NewAddress.addAddress();
        NewAddress.addNewAddress();
    }

    @Given("Search for ‘Mobile Phone’ on the ‘amazon.com’ homepage.")
    public void searchForMobilePhoneOnTheAmazonComHomepage() {
        HomePage.home();
        HomePage.searchItem();
    }

    @And("Same test to be repeated on Chrome browser \\(assuming you’re using Firefox as default browser else vice-versa).")
    public void sameTestToBeRepeatedOnChromeBrowserAssumingYouReUsingFirefoxAsDefaultBrowserElseViceVersa() {
        
    }

    @And("Any actions in any page are welcome \\(like sorting the products in product listing page, page header assertions in each page to validate if on right page, etc).")
    public void anyActionsInAnyPageAreWelcomeLikeSortingTheProductsInProductListingPagePageHeaderAssertionsInEachPageToValidateIfOnRightPageEtc() {

        //All assertions have been added to all pages wherever required
    }
}
