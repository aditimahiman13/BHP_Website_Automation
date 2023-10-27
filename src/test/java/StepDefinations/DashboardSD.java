package StepDefinations;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;

import Pages.BaseClass;
import Pages.DashboardPage;
import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSD extends BaseClass {


    @Then("I verify {string} text is displayed on the PE dashboard")
    public void i_verify_text_is_displayed_on_the_pe_dashboard(String string) throws InterruptedException {
        Thread.sleep(3000);
        dashboard.defaultProjectstate();
    }

    @And("I select project from dropdown")
    public void iSelectProjectFromDropdown() throws InterruptedException {
        dashboard.selectProject();
    }

    @Then("I verify that the project is selected")
    public void iVerifyThatTheProjectIsSelected() {
        dashboard.verifySelectedProject();
    }

    @And("I add a row")
    public void iAddARow() throws InterruptedException {
        dashboard.AddRow();
    }

    @Then("I verify that the row is added")
    public void iVerifyThatTheRowIsAdded() {
        dashboard.verifyAddRowCount();
    }

    @And("I delete a row")
    public void iDeleteARow() throws InterruptedException {
        dashboard.deleteRow();
    }

    @Then("I verify that the row is deleted")
    public void iVerifyThatTheRowIsDeleted() {
        dashboard.verifyDeleteMessage();
    }

    @And("I enter values in the vendor details")
    public void iEnterValuesInTheVendorDetails() throws InterruptedException {

        dashboard.addVendorDetails();
    }

    @Then("I verify that value is entered in vendor details")
    public void iVerifyThatValueIsEnteredInVendorDetails() {
    }

    @And("I enter text in the Text")
    public void iEnterTextInTheText() throws InterruptedException {
        dashboard.addText();

    }

    @Then("I verify that text is entered in Text")
    public void iVerifyThatTextIsEnteredInText() throws InterruptedException {
        //dashboard.verifyTextIsEntered();
    }

    @And("I enter values in the Budget column")
    public void iEnterValuesInTheBudgetColumn() throws InterruptedException {
        dashboard.addBudget();

    }

    @Then("I verify that values are entered in TBudget column")
    public void iVerifyThatValuesAreEnteredInTBudgetColumn() {
    }

    @And("I enter values in the September month column")
    public void iEnterValuesInTheSeptemberMonthColumn() throws InterruptedException {
        dashboard.monthSeptember();
    }

    @Then("I verify that values are entered in September month column")
    public void iVerifyThatValuesAreEnteredInSeptemberMonthColumn() {

    }

    @And("I enter values in the October month column")
    public void iEnterValuesInTheOctoberMonthColumn() throws InterruptedException {
        dashboard.monthOctober();
    }

    @Then("I verify that values are entered in October month column")
    public void iVerifyThatValuesAreEnteredInOctoberMonthColumn() {

    }

    @And("I enter values in the November month column")
    public void iEnterValuesInTheNovemberMonthColumn() throws InterruptedException {
        dashboard.monthNovember();
    }

    @Then("I verify that values are entered in November month column")
    public void iVerifyThatValuesAreEnteredInNovemberMonthColumn() {
    }

    @And("I enter text in the Text Search column")
    public void iEnterTextInTheTextSearchColumn() throws InterruptedException {
       dashboard.enterSearchText();;
       Thread.sleep(2000);
    }

    @Then("I verify that text is entered in Text Search column")
    public void iVerifyThatTextIsEnteredInTextSearchColumn() {
    }

    @And("I enter text in the Vendor details Search column")
    public void iEnterTextInTheVendorDetailsSearchColumn() throws InterruptedException {
        dashboard.enterSearchVendorDetails();
        Thread.sleep(2000);
    }

    @Then("I verify that text is entered in Vendor details Search column")
    public void iVerifyThatTextIsEnteredInVendorDetailsSearchColumn() {
    }

    @And("I select Contains filter")
    public void iSelectContainsFilter() throws InterruptedException {
       dashboard.selectContainsTextFilter();
        Thread.sleep(2000);
    }

    @Then("I verify that results are  filtered as per Contains in Text Search column")
    public void iVerifyThatResultsAreFilteredAsPerContainsInTextSearchColumn() {
    }

    @And("I select Does not Contain filter")
    public void iSelectDoesNotContainFilter() throws InterruptedException {
       dashboard.selectDoesNotContainTextFilter();
    }

    @Then("I verify that results are  filtered as per Does not Contain in Text Search column")
    public void iVerifyThatResultsAreFilteredAsPerDoesNotContainInTextSearchColumn() {
    }

    @And("I click on the logout button")
    public void iClickOnTheLogoutButton() {
        dashboard.Logout();
    }

    @Then("I verify that I am on the login screen")
    public void iVerifyThatIAmOnTheLoginScreen() throws InterruptedException {
        login.verifyLoginDash();
    }

    @And("I select Equals filter")
    public void iSelectEqualsFilter() throws InterruptedException {
        dashboard.selectEqualsTextFilter();
    }

    @Then("I verify that results are  filtered as per Equals in Text Search column")
    public void iVerifyThatResultsAreFilteredAsPerEqualsInTextSearchColumn() {
    }

    @Then("I verify that results are  filtered as per Does not equal in Text Search column")
    public void iVerifyThatResultsAreFilteredAsPerDoesNotEqualInTextSearchColumn() {

    }

    @And("I select Does not equal filter")
    public void iSelectDoesNotEqualFilter() throws InterruptedException {
        dashboard.selectDoesNotEqualTextFilter();
    }

    @And("I select Empty filter")
    public void iSelectEmptyFilter() throws InterruptedException {
        dashboard.selectEmptyTextFilter();
    }

    @Then("I verify that results are  filtered as per Empty in Text Search column")
    public void iVerifyThatResultsAreFilteredAsPerEmptyInTextSearchColumn() {
    }

    @And("I select Not Empty filter")
    public void iSelectNotEmptyFilter() throws InterruptedException {
        dashboard.selectNotEmptyTextFilter();
    }

    @Then("I verify that results are  filtered as per Not Empty in Text Search column")
    public void iVerifyThatResultsAreFilteredAsPerNotEmptyInTextSearchColumn() {
    }

    @And("I select Starts with filter")
    public void iSelectStartsWithFilter() throws InterruptedException {
        dashboard.selectStartsWithTextFilter();
    }

    @Then("I verify that results are  filtered as per Starts with in Text Search column")
    public void iVerifyThatResultsAreFilteredAsPerStartsWithInTextSearchColumn() {
        
    }

    @And("I select Ends with filter")
    public void iSelectEndsWithFilter() throws InterruptedException {
        dashboard.selectEndsWithTextFilter();
    }

    @Then("I verify that results are  filtered as per Ends with in Text Search column")
    public void iVerifyThatResultsAreFilteredAsPerEndsWithInTextSearchColumn() {

    }

    @And("I select Disable filter")
    public void iSelectDisableFilter() throws InterruptedException {
        dashboard.selectDisableTextFilter();
        Thread.sleep(2000);
    }

    @Then("I verify that results are  filtered as per Disable in Text Search column")
    public void iVerifyThatResultsAreFilteredAsPerDisableInTextSearchColumn() {

    }

    @And("I select Enable filter")
    public void iSelectEnableFilter() throws InterruptedException {
        dashboard.selectEnableTextFilter();
    }

    

    @Then("I verify that I am not able to enter values in Text Search column")
    public void iVerifyThatIAmNotAbleToEnterValuesInTextSearchColumn() {
    }

    @Then("I verify that I can enter values in the Text Search column")
    public void iVerifyThatICanEnterValuesInTheTextSearchColumn() {
    }

    @And("I select Clear filter")
    public void iSelectClearFilter() throws InterruptedException {
        dashboard.selectClearTextFilter();
        Thread.sleep(2000);
    }

    @Then("I verify that Text Search column values are cleared")
    public void iVerifyThatTextSearchColumnValuesAreCleared() {
    }

    @And("I select Clear All  filter")
    public void iSelectClearAllFilter() throws InterruptedException {
        dashboard.selectClearAllTextFilter();
        Thread.sleep(2000);
    }

    @Then("I verify that Text Search column  and Vendor details column values are cleared")
    public void iVerifyThatTextSearchColumnAndVendorDetailsColumnValuesAreCleared() {
    }
<<<<<<< HEAD


    @And("I  cancel delete row")
    public void iCancelDeleteRow() {
        dashboard.deleteRowCancel();
    }

    @Then("I verify that the row is not  deleted")
    public void iVerifyThatTheRowIsNotDeleted() {
        dashboard.verifyDeleteRowCancel();
    }
=======
>>>>>>> c5fe58cb05df9e2ee379fb19e64ad042150e9c55
}