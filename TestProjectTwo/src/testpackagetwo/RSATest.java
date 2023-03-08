package testpackagetwo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class RSATest {
	
	public static WebDriver Driver;
	
	@Test(priority=1)
	public void RSAdata()throws Exception{
		
		System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\msedgedriver.exe");
		WebDriver Driver=new EdgeDriver();
		Driver.get("http://10.30.139.92/PivotPointV2Web/Login.aspx");
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();
		Driver.findElement(By.id("UserId")).sendKeys("rsaadmin");
		//Driver.findElement(By.id("UserId")).sendKeys("1rpatel");
		Driver.findElement(By.id("Password")).sendKeys("cateXX787!");
		Driver.findElement(By.id("PIN")).sendKeys("0808");
		Driver.findElement(By.id("LinkButton1")).click();
		Thread.sleep(4800);
		
		try{
		Alert alert14=Driver.switchTo().alert();
		Thread.sleep(1000);
		alert14.accept();
		Thread.sleep(4000);
		}catch(NoAlertPresentException e){
			e.printStackTrace();
		}
		
	    Driver.findElement(By.id("Board1_ADDCONTRACT")).click();
		Thread.sleep(4500);
		//Driver.findElement(By.xpath("//table/tbody/tr[]/td[]")).click();
		
		//Programme Information
		Driver.findElement(By.name("CedentListCB")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='CedentListCB_DropDown']/div[2]/ul/li[5]/table/tbody/tr/td[2]")).click();
		Thread.sleep(11800);
		Driver.findElement(By.name("BTListCB")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='BTListCB_DropDown']/div[2]/ul/li[2]/table/tbody/tr/td[2]")).click();
		Thread.sleep(4500);
		Driver.findElement(By.name("rcContractStatusType")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='rcContractStatusType_DropDown']/div/ul/li[2]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("txtProgramName")).sendKeys("Contour");
		Thread.sleep(1000);
		
		//Underlying Policy Information
		Driver.findElement(By.xpath("//*[@id='RadPageView1']/div/div/div/div[4]/div/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td/label/span")).click();
		Thread.sleep(4500);
		Driver.findElement(By.id("txtClientName")).sendKeys("Global");
		Driver.findElement(By.id("txtPolicyNo")).sendKeys("UKC1234");
		Thread.sleep(1000);
		Driver.findElement(By.id("AddOrigPolicy")).click();
		Thread.sleep(2800);
		Driver.findElement(By.id("chkPolicy_1")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("txtPropSumInsured")).sendKeys("224516250");
		Driver.findElement(By.id("txtBISumInsured")).sendKeys("98880625");
		Thread.sleep(5000);
		Driver.findElement(By.id("rcOrigCurrency_Input")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='rcOrigCurrency_DropDown']/div/ul/li[56]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("txtOrigGrossPrem")).sendKeys("1401128");
		Driver.findElement(By.name("txtOrigComRate")).sendKeys("6");
		Thread.sleep(1000);		
		Driver.findElement(By.id("rcBOA_Input")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='rcBOA_DropDown']/div/ul/li[3]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("txtOrigBasisOfAssessmentAmt")).sendKeys("222780625");
		Thread.sleep(1000);
		
		Driver.findElement(By.id("rcOrigPolicyPerils_Input")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='rcOrigPolicyPerils_DropDown']/div/ul/li[4]/label")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("rcTradeGroup_Input")).click();
		Thread.sleep(2000);
		//Driver.findElement(By.xpath("//*[@id='rcTradeGroup_DropDown']/div/ul/li[12]")).click();
		Driver.findElement(By.xpath("//*[@id='rcTradeGroup_DropDown']/div/ul/li[6]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("rcOccupation_Input")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='rcOccupation_DropDown']/div/ul/li[12]")).click();
		Thread.sleep(5000);
		Driver.findElement(By.id("rcOrigBasisOfCover_Input")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='rcOrigBasisOfCover_DropDown']/div/ul/li[3]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("txtShare")).sendKeys("16");
		Driver.findElement(By.id("txtLimit")).sendKeys("350000000");
		Thread.sleep(1000);
		Driver.findElement(By.id("LinkButton5")).click();		
		Thread.sleep(4500);
		JavascriptExecutor jse=(JavascriptExecutor)Driver;
		jse.executeScript("scrollBy(0,4500)");
		Thread.sleep(2000);
		
		//Reinsurance Policy Information
		Driver.findElement(By.id("LOBListCB_Arrow")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='LOBListCB_DropDown']/div[2]/ul/li[5]/table")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("txtContractYearStartDate_dateInput")).clear();
		Thread.sleep(1000);
		Driver.findElement(By.id("txtContractYearStartDate_dateInput")).sendKeys("Jan 01 2020");
		Thread.sleep(2000);
		
		Driver.findElement(By.id("txtContractYearEndDate_dateInput")).clear();
		Alert alert=Driver.switchTo().alert();
		alert.accept();		
		Thread.sleep(1000);
		Driver.findElement(By.id("txtContractYearEndDate_dateInput")).sendKeys("Dec 31 2022");
		Driver.findElement(By.id("rcPurchaseReason_Arrow")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='rcPurchaseReason_DropDown']/div/ul/li[1]")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("rcPurchaseSubReason_Arrow")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='rcPurchaseSubReason_DropDown']/div/ul/li[2]")).click();
		Thread.sleep(2000);	
		
		Driver.findElement(By.id("rcBrokenInceptionReason_Arrow")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='rcBrokenInceptionReason_DropDown']/div/ul/li[3]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("txtLayerName")).sendKeys("Global");
		Driver.findElement(By.id("rcTypeOfCover_Arrow")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='rcTypeOfCover_DropDown']/div/ul/li[2]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("rcbWordType_Arrow")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='rcbWordType_DropDown']/div/ul/li[3]")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("OwnerPlacedPct")).clear();
		Driver.findElement(By.id("OwnerPlacedPct")).sendKeys("16");
		Driver.findElement(By.id("txtLayerLimit")).sendKeys("18750000");
		Driver.findElement(By.id("txtAttachment")).sendKeys("12500000");
		Driver.findElement(By.id("btnCopy")).click();		
		Thread.sleep(4000);
		
		//Market
		Driver.findElement(By.id("MarketListCB_Arrow")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='MarketListCB_DropDown']/div[2]/ul/li[3]/table/tbody/tr/td[2]")).click();
		Thread.sleep(4800);
		Driver.findElement(By.id("ReinsurerListCB_New_Arrow")).click();
		Thread.sleep(4800);
		Driver.findElement(By.xpath("//*[@id='ReinsurerListCB_New_DropDown']/div[2]/ul/li[101]/table/tbody/tr/td[2]")).click();
		Thread.sleep(2800);
		Driver.findElement(By.id("AuthPercentTB")).sendKeys("16");
		Driver.findElement(By.id("PremAmtTB")).sendKeys("18750000");
		Driver.findElement(By.id("txtCommissionPct")).sendKeys("0");
		Driver.findElement(By.id("rcTermsofTrade_Arrow")).click();		
		Thread.sleep(1000);
		//Driver.findElement(By.xpath("/html/body/form/div[1]/div/div/ul/li[7]")).click();
		Driver.findElement(By.xpath("/html/body/form/div[1]/div/div/ul/li[6]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("LinkButton1")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='tblAccountingSystem']/tbody/tr/td[3]/label/span")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("LinkButton2")).click();
		Thread.sleep(18000);
		
	    Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(18000);
		Driver.findElement(By.xpath("//*[@id='objGridContracts-0-1']/a")).click();
		Thread.sleep(4000);
		
		//Risk Portfolio
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[4]/a/span")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("btnAddRisk")).click();
		Thread.sleep(10000);
		
		Driver.findElement(By.id("txtStreetNumber")).sendKeys("111");
		Driver.findElement(By.id("txtBuildingNumber")).sendKeys("E");
		Driver.findElement(By.id("txtStreetName")).sendKeys("Santa Cruise");
		Driver.findElement(By.id("txtCity")).sendKeys("London");
		Driver.findElement(By.id("txtStateName")).sendKeys("UK");
		Driver.findElement(By.id("txtPostalCode")).sendKeys("E15420");
		Driver.findElement(By.id("txtCountry")).sendKeys("United Kingdom");
		Thread.sleep(2000);
		Driver.findElement(By.id("UCLocations_btnUpdateLayerRisk")).click();
		Thread.sleep(8000);
		Alert alt=Driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(8000);
		
		//Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[1]")).click();
		//Thread.sleep(2000);
		//Driver.findElement(By.id("btnAddDocument")).click();
		//Thread.sleep(4000);
		
		//Documents-upload
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[5]/a/span")).click();
		Thread.sleep(5800);
		Driver.findElement(By.id("btnAddDoc")).click();
		Thread.sleep(2000);
		
		Set<String> AllWindowHandles=Driver.getWindowHandles();
		String window1=(String)AllWindowHandles.toArray()[0];
		String window2=(String)AllWindowHandles.toArray()[1];		
		Driver.switchTo().window(window2);
		Driver.findElement(By.id("DocumentName")).sendKeys("Contour Slip");
		Driver.findElement(By.id("DocumentDescr")).sendKeys("Slip for the Contour Prog");
		Thread.sleep(1000);
		Driver.findElement(By.id("DocumentName")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='DocumentCategoryType']/option[74]")).click();
		Thread.sleep(2000);
				
		Actions act02=new Actions(Driver);
		WebElement chooseFile=Driver.findElement(By.id("UploadFile"));
		act02.moveToElement(chooseFile).click().perform();
		Thread.sleep(5800);
		uploadFile("C:\\Users\\ssingh\\Documents\\New folder\\Complete RSA end to end testing.xlsx");		
		Thread.sleep(5800);
		Driver.findElement(By.id("Upload")).click();		
		Thread.sleep(11000);		
		Driver.switchTo().window(window1);
		Thread.sleep(8000);
		
		//Documents-upload
		Driver.findElement(By.id("btnAddDoc")).click();
		Thread.sleep(2000);
		
		Set<String> AllWindowHandles01=Driver.getWindowHandles();
		String window4=(String)AllWindowHandles01.toArray()[0];
		String window5=(String)AllWindowHandles01.toArray()[1];		
		Driver.switchTo().window(window5);
		Driver.findElement(By.id("DocumentName")).sendKeys("Contour Slip");
		Driver.findElement(By.id("DocumentDescr")).sendKeys("Slip for the Contour Prog");
		Thread.sleep(1000);
		Driver.findElement(By.id("DocumentName")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='DocumentCategoryType']/option[74]")).click();
		Thread.sleep(2000);
				
		Actions act04=new Actions(Driver);
		WebElement chooseFile01=Driver.findElement(By.id("UploadFile"));
		act04.moveToElement(chooseFile01).click().perform();
		Thread.sleep(5800);
		uploadFile("C:\\Users\\ssingh\\Documents\\New folder\\Complete RSA end to end testing.xlsx");		
		Thread.sleep(5800);
		Driver.findElement(By.id("Upload")).click();		
		Thread.sleep(11000);		
		Driver.switchTo().window(window4);
		Thread.sleep(5800);		
		Driver.findElement(By.xpath("//*[@id='TblDocuments']/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/div")).click();
		Thread.sleep(9000);
		
		//Download document
		Driver.findElement(By.xpath("//*[@id='GridContractDoc_row_0']/td[2]/a")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("btnDownloadFile")).click();
		Thread.sleep(14000);
		
		Set<String> AllWindowHandles02=Driver.getWindowHandles();
		String win07=(String)AllWindowHandles02.toArray()[0];
		String win08=(String)AllWindowHandles02.toArray()[1];
		Driver.switchTo().window(win08);
		Driver.close();
		Thread.sleep(4000);
		Driver.switchTo().window(win07);
		Thread.sleep(4000);
		Driver.findElement(By.id("Img3")).click();
		Thread.sleep(4000);
		
		//Thread.sleep(8000);
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("objGridContracts-0-1")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[5]/a/span")).click();
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//*[@id='GridContractDoc_row_0']/td[15]/div/div/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(4800);
				
		//Contracts Tab
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(11000);
		Driver.findElement(By.xpath("//*[@id='objGridContracts-0-0']/a")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("CopyProgram")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("ContractYearStartDateCopy_Picker1_picker")).clear();
		Thread.sleep(2000);
		Driver.findElement(By.id("ContractYearStartDateCopy_Picker1_picker")).sendKeys("06/1/2020");
		Thread.sleep(2000);
		Driver.findElement(By.id("ContractYearEndDate_Picker1_picker")).clear();
		Thread.sleep(2000);
		Driver.findElement(By.id("ContractYearEndDate_Picker1_picker")).sendKeys("12/31/2023");
		Thread.sleep(4000);
		
		//Complex - Copy Program
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[4]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[4]/div/select/option[2]")).click();
		Thread.sleep(4000);
		//WebElement reason = Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[4]"));
		//reason.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[5]")).click();
		Thread.sleep(2000);	
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[5]/div/select/option[1]")).click();
		Thread.sleep(2000);		
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[13]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[13]/div/select/option[4]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("CopyProgram")).click();
		Thread.sleep(8000);
						
		//Cntrt ID hyperlink- Add type of cover and Territories
		try{
		Driver.findElement(By.xpath("//*[@id='Grid1_row_0']/td[2]/div/a")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[2]")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("Edit2")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("rcTypeOfCover_Arrow")).click();
		Thread.sleep(2800);
		Driver.findElement(By.xpath("//*[@id='rcTypeOfCover_DropDown']/div/ul/li[1]")).click();
		Thread.sleep(2800);
		Driver.findElement(By.id("rcTerritories")).click();
		Thread.sleep(2800);
		Driver.findElement(By.xpath("//*[@id='rcTerritories_DropDown']/div/ul/li[88]/label/input")).click();
		Thread.sleep(2800);
		Driver.findElement(By.id("rcbCvntStatusDesc_Input")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='rcbCvntStatusDesc_DropDown']/div/ul/li[3]")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("LinkButton2")).click();
		Thread.sleep(18000);
		}catch(NoSuchElementException e){
			e.printStackTrace();
		}
		Thread.sleep(2000);
							
		//Contracts Tab - Copy Program
		Driver.get("http://10.30.139.92/PivotPointV2Web/Modules/MainPage/DefaultDE.aspx");
		Thread.sleep(8000);
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(11000);
		Driver.findElement(By.xpath("//*[@id='objGridContracts-0-0']/a")).click();
		Thread.sleep(4000);
		//Copy Btn
		Driver.findElement(By.id("CopyProgram")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[4]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[4]/div/select/option[3]")).click();
		Thread.sleep(4000);		
		//WebElement reason=Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[4]"));
		//reason.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[5]")).click();
		Thread.sleep(2000);	
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[5]/div/select/option[2]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[8]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[8]/div/select/option[1]")).click();
		Thread.sleep(2800);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[10]/input")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[11]/input")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[13]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridProgramBoard_row_0']/td[13]/div/select/option[2]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("CopyProgram")).click();
		Thread.sleep(8000);
	
		//Companies Tab - Add market
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(11000);
		Driver.findElement(By.xpath("//*[@id='objGridContracts-0-1']/a")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[2]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[3]")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("btnManageContractParties")).click();
		Thread.sleep(4000);
		
		//Add market-Market-facility
		Driver.findElement(By.id("LinkButton1")).click();		
		Thread.sleep(2000);
		Driver.findElement(By.id("imgBroker")).click();
		Thread.sleep(9000);
		Driver.findElement(By.id("cboBroker_3_3")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("cboMarket_28_3")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='GridMarkets_row_0']/td[7]/div/a[1]")).click();
		Thread.sleep(4000);
		
		//Market Terms
		Driver.findElement(By.id("btnManageMarketTerms")).click();
		Thread.sleep(2800);
		Driver.findElement(By.id("OwnerPremiumType_1")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='OwnerPremiumType_1']/option[4]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("OwnerPremiumAmount_1")).sendKeys("5000");
		Driver.findElement(By.id("OwnerTermsOfTradeType_1")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='OwnerTermsOfTradeType_1']/option[2]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("OwnerAuthorized_1")).sendKeys("110");
		Thread.sleep(1000);
		Driver.findElement(By.id("btnSavePlacement")).click();
		Thread.sleep(2000);
		Alert alt01=Driver.switchTo().alert();
		Thread.sleep(1000);
		alt01.accept();
		Thread.sleep(2000);
		alt01.accept();
		Thread.sleep(2000);
		Driver.findElement(By.id("OwnerAuthorized_1")).sendKeys("20");
		Thread.sleep(1000);
		Driver.findElement(By.id("OwnerPlacementStatus_1")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='OwnerPlacementStatus_1']/option[12]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("OwnerCedingCommission_1")).sendKeys("0");
		Thread.sleep(1000);
		Driver.findElement(By.id("btnCreateContract")).click();
		Thread.sleep(2000);
		Alert alt04=Driver.switchTo().alert();
		Thread.sleep(1000);
		alt04.accept();
		Thread.sleep(2000);
		Driver.findElement(By.id("OwnerAuthorized_1")).clear();
		Thread.sleep(1000);
		Driver.findElement(By.id("OwnerAuthorized_1")).sendKeys("16");
		Thread.sleep(1000);
		
		Driver.findElement(By.id("OwnerPlacementStatus_1")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='OwnerPlacementStatus_1']/option[12]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("btnCreateContract")).click();
		Thread.sleep(4000);
		Alert alt08=Driver.switchTo().alert();
		Thread.sleep(1000);
		alt08.accept();	
		Thread.sleep(2000);
		Driver.findElement(By.id("ddBrokenInceptionReason")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='ddBrokenInceptionReason']/option[4]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("btnCreateContract")).click();
		Thread.sleep(12000);
		
		//Driver.findElement(By.id("Board1_CONTRACTS")).click();
		//Thread.sleep(8000);
		//Driver.findElement(By.id("objGridContracts-0-1")).click();
		//Thread.sleep(5800);
		
		//Add layer
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[1]")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("AddLayer")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("txtLayerLimit")).sendKeys("15000000");
		Driver.findElement(By.id("txtAttachmentPoint")).sendKeys("15000000");
		Driver.findElement(By.id("btnUpdateLayerLimit")).click();
		Thread.sleep(4000);
		Alert alt09=Driver.switchTo().alert();
		Thread.sleep(2000);
		alt09.accept();
		Thread.sleep(2000);
		Driver.findElement(By.name("optLayer")).click();
		Thread.sleep(1000);
		Driver.findElement(By.id("CopyLayer")).click();
		Thread.sleep(2000);
		
		Driver.findElement(By.id("modalPopup_C_lnkBtnEditedLayerDetails")).click();
		Thread.sleep(5800);
		Driver.findElement(By.name("txtCopyLayerLL_0")).clear();
		Thread.sleep(1000);
		Driver.findElement(By.name("txtCopyLayerLL_0")).sendKeys("5000000");
		Driver.findElement(By.name("txtCopyLayerAttachmentPt_0")).clear();
		Thread.sleep(1000);
		Driver.findElement(By.name("txtCopyLayerAttachmentPt_0")).sendKeys("500000");
		Thread.sleep(1000);
		Driver.findElement(By.id("modalPopup_C_lnkBtnCopyLayerDetails")).click();
		Thread.sleep(4000);
		Alert alt10=Driver.switchTo().alert();
		Thread.sleep(2000);
		alt10.accept();
		Thread.sleep(8000);
		
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(11000);
		Driver.findElement(By.id("objGridContracts-0-1")).click();
		Thread.sleep(4000);
		System.out.println("Script completed as expected");
		//Driver.findElement(By.id("DeleteContract")).click();
		//Thread.sleep(4000);
		//Alert alt11=Driver.switchTo().alert();
		//Thread.sleep(2000);
		//alt11.accept();
		
				
	}
    public static void setClipBoard(String file){
		
		StringSelection obj=new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}
	
	public static void uploadFile(String filePath) throws AWTException{
		
		setClipBoard(filePath);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
