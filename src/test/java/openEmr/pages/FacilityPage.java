package openEmr.pages;

import openEmr.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FacilityPage extends BrowserUtils {

    public FacilityPage(){
        PageFactory.initElements(driver,this);
    }

   @FindBy(xpath = "(//div[contains(text(),'Admin')])[1]")
    private WebElement admin;
    @FindBy(xpath = "(//div[contains(text(),'Clinic')])[1]")
    private WebElement clinic;
    @FindBy(xpath = "(//div[contains(text(),'Facilities')])[1]")
    private WebElement facilities;
    @FindBy(xpath = "(//h2[contains(text(),'Facilities')])[1]")
    private WebElement facilitiesText;
    @FindBy(name = "adm")
    private WebElement frameFacilities;
    @FindBy(xpath = "//a[contains(text(),'Add Facility')]")
    private WebElement addFacility;
    @FindBy(name = "facility")
    private WebElement name;
    @FindBy(name = "street")
    private WebElement address;
    @FindBy(name = "federal_ein")
    private WebElement taxId;
    @FindBy(name = "pos_code")
    private WebElement posCode;
    @FindBy(name = "phone")
    private WebElement phone;
    @FindBy(name = "ncolor")
    private WebElement color;
    @FindBy(xpath = "//iframe[@id='modalframe']")
    private WebElement iframeAddFacilities;
    @FindBy(xpath = "(//button[@class='btn btn-primary btn-save'])[1]")
    private WebElement saveButton;






    public void setFacilities(){
        Actions actions=new Actions(driver);
        actions.click(admin).click(clinic).click(facilities).build().perform();
    }
    public String setFacilitiesText(){
        driver.switchTo().frame(frameFacilities);
        return facilitiesText.getText();
    }
    public void setAddFacility(){
        addFacility.click();
        driver.switchTo().window(driver.getWindowHandle());
        driver.switchTo().frame(iframeAddFacilities);
    }
    public void setRequiredFields(String name,String address,String taxId,String posCode,String phone,String color){
        this.name.sendKeys(name);
        this.address.sendKeys(address);
        this.taxId.sendKeys(taxId);
        Select select=new Select(this.posCode);
        select.selectByVisibleText(posCode);
        this.phone.sendKeys(phone);
        this.color.sendKeys(color);
    }
    public void setSaveButton() throws InterruptedException {
        Thread.sleep(3000);
        saveButton.click();
    }


}
