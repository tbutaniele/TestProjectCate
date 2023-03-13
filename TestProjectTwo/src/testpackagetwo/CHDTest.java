package testpackagetwo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CHDTest {
	
	public static WebDriver Driver;
	
	@Test(priority=1)
	public void CHDdata()throws Exception{
		
		WebDriverManager.edgedriver().setup();
		//System.setProperty("webdriver.edge.driver", "C:\\Edgedriver\\msedgedriver.exe");		
		WebDriver Driver = new EdgeDriver();
		Driver.get("http://10.30.139.92/PivotPointV2Web/Login.aspx");
		Driver.manage().window().maximize();
		Driver.manage().deleteAllCookies();

		// Login Page
		Driver.findElement(By.id("UserId")).sendKeys("chdadmin");
		Driver.findElement(By.id("Password")).sendKeys("cateXX787!");
		Driver.findElement(By.id("PIN")).sendKeys("0808");
		Driver.findElement(By.id("LinkButton1")).click();
		Thread.sleep(8000);
		Thread.sleep(8000);
		// Owner Selection
		Driver.findElement(By.xpath("//*[@id='SystemsTable']/tbody/tr[3]/td[2]/a/u")).click();
		Thread.sleep(11000);
		Thread.sleep(7000);

		// ADD Contract		
		Driver.findElement(By.xpath("//*[@id='divdivADDCONTRACT']/div/div/div[1]/img")).click();
		Thread.sleep(3000);
		Driver.findElement(By.id("SubpartCoverType3_0")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("LayerCoverType3")).click();

		Thread.sleep(2000);
		Select oselect = new Select(Driver.findElement(By.xpath("//*[@id='LayerCoverType3']")));		
		oselect.selectByValue("FACULTATIVE#EXCESS FAC#PROPORTIONAL");
		
		Select obselect1 = new Select(Driver.findElement(By.xpath("//*[@id='LayerCoverType3']")));
		Thread.sleep(5000);
		Driver.findElement(By.id("InsuredName")).sendKeys("Food Company");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='BtnAddInsured']/span")).click();
		Thread.sleep(4000);		
		Driver.findElement(By.id("CedentCompanyId_ComboBoxCompanies_DropImage")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='CedentCompanyId_ComboBoxCompanies_item_2']/nobr/table/tbody/tr/td[2]")).click();
		Thread.sleep(5000);
		Driver.findElement(By.id("ProgramName")).clear();
		Driver.findElement(By.id("ProgramName")).sendKeys("A&E Food Company");
		Thread.sleep(4000);
		Driver.findElement(By.id("ContractYearStartDate")).clear();
		Driver.findElement(By.id("ContractYearStartDate")).sendKeys("1/1/2022");
		Driver.findElement(By.id("ContractYearEndDate")).clear();
		Driver.findElement(By.id("ContractYearEndDate")).sendKeys("12/31/2022");
		Thread.sleep(1000);
		Driver.findElement(By.id("ClaimCoverageType_1")).click();
		Driver.findElement(By.id("LOB")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='LOB']/option[9]")).click();
		Thread.sleep(10000);
		Driver.findElement(By.id("CoveragesIncluded")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='CoveragesIncluded']/option[5]")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("BusinessType")).click();
		Thread.sleep(2000);
		//Driver.findElement(By.xpath("//*[@id='BusinessType']/option[30]")).click();
		Driver.findElement(By.xpath("//*[@id='BusinessType']/option[6]")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("LayerLimit")).sendKeys("2500000");
		Thread.sleep(2000);
		//Driver.findElement(By.id("AttachmentPoint")).sendKeys("0");
		Driver.findElement(By.id("AttachmentPoint")).sendKeys("25000");
		Thread.sleep(2000);
		Driver.findElement(By.id("AttachmentBasisType")).click();
		Thread.sleep(2000);
		//Driver.findElement(By.xpath("//*[@id='AttachmentBasisType']/option[10]")).click();
		Driver.findElement(By.xpath("//*[@id='AttachmentBasisType']/option[7]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("LayerLimitPerilType")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='LayerLimitPerilType']/option[8]")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("LinkButton1")).click();
		Thread.sleep(14000);
		Thread.sleep(8000);
					
		//Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/MainPage/DefaultDE.aspx?ItemId=CONTRACTS");
		//Thread.sleep(10000);
		//String latestContractid = Driver.findElement(By.xpath("/html/body/form/div[12]/table/tbody/tr[2]/td[2]/div[2]/div[4]/div[2]/div[2]/div/div[1]/table/tbody/tr[1]/td[1]/a")).getText();
		//System.out.println(latestContractid);
		//Driver.findElement(By.xpath("/html/body/form/div[12]/table/tbody/tr[2]/td[2]/div[2]/div[4]/div[2]/div[2]/div/div[1]/"
			//	+ "table/tbody/tr[1]/td[1]/a")).click();
		//Thread.sleep(10000);
		//Driver.navigate().refresh();
		
		//Submission Parties
		Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/Participants/ManageParticipantsSL2.aspx");
		Thread.sleep(8000);
		Driver.findElement(By.xpath("/html/body/form/div[8]/div[10]/div[2]/table[1]/tbody/tr[1]/td/table/tbody/tr/td/a[1]/span")).click();
		Thread.sleep(5000);
		Driver.findElement(By.xpath("//*[@id='LinkButton1']/span")).click();
		Thread.sleep(5000);

		// Submission Parties-Companies
		Driver.findElement(By.xpath("//*[@id='imgBroker']")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='cboBroker_41_3']")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='cboMarket_16_3']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.linkText("Insert")).click();
		Thread.sleep(2000);
		
		Driver.findElement(By.id("btnAddCedent")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='imgCedentBroker']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='cboCedentBroker_18_3']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridCedents_row_1']/td[8]/div/a[1]")).click();
		Thread.sleep(2800);
		//Add Co-Broker
		//Recent comment
		/*Driver.findElement(By.id("btnAddCoBrokers")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='imgCoBroker']")).click();
		Thread.sleep(2000);
        Driver.findElement(By.xpath("//*[@id='cboCoBroker_33_3']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='imgCoBrokerBrokerageFeeType']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='cboCoBrokerBrokerageFeeType_1_2']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='imgCoBrokerBrokerageType']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='cboCoBrokerBrokerageType_4_2']")).click();
		Thread.sleep(2000);
		Driver.findElement(By.name("chkCOBROKERIsPremium")).click();
		Thread.sleep(1000);
		Driver.findElement(By.name("chkCOBROKERIsFeeCharge")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridCoBrokers_row_0']/td[8]/div/a[1]")).click();*/
		Thread.sleep(4000);
		
		//Submission Parties-Market Terms
		Driver.findElement(By.id("btnManageMarketTerms")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("OwnerPremiumType_1")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='OwnerPremiumType_1']/option[4]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("OwnerPremiumAmount_1")).sendKeys("100000");
		Driver.findElement(By.id("OwnerAuthorized_1")).sendKeys("100");
		Driver.findElement(By.id("OwnerPlacementStatus_1")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='OwnerPlacementStatus_1']/option[11]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("OwnerBrokerage_1")).sendKeys("5");
		Driver.findElement(By.id("OwnerOwnAccountPct_1")).sendKeys("10");
		Thread.sleep(1000);
		Driver.findElement(By.id("PaymentSchedule")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='PaymentSchedule']/option[3]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("btnSavePlacement")).click();
		Thread.sleep(8000);
								
		//Driver.findElement(By.id("Board1_CONTRACTS")).click();
		//Thread.sleep(6800);
		//Driver.findElement(By.xpath("//*[@id='objGridContracts-0-0']/a")).click();
		//Thread.sleep(6800);
		
		//Document upload
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[7]/a")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("btnAddDoc")).click();
		Thread.sleep(5800);
		
		// Enter in another small window
		Set<String> AllWindowHandles = Driver.getWindowHandles();
		String window1 = (String) AllWindowHandles.toArray()[0];
		String window2 = (String) AllWindowHandles.toArray()[1];
		Driver.switchTo().window(window2);
		Thread.sleep(5800);

		// Upload file
		Driver.findElement(By.id("DocumentName")).sendKeys("Screening Report");
		Thread.sleep(1000);
		Driver.findElement(By.id("DocumentDescr")).sendKeys("Screening Report");
		Thread.sleep(1000);
		Select DocumentType = new Select(Driver.findElement(By.id("DocumentCategoryType")));
		Thread.sleep(5000);
		Driver.findElement(By.id("DocumentCategoryType")).click();
		Thread.sleep(4000);
		DocumentType.selectByValue("SCREENING REPORT");
		Thread.sleep(4000);
		Driver.findElement(By.id("TermsCB")).click();
        Thread.sleep(2000);
		
		Actions act02 = new Actions(Driver);
		WebElement chooseFile = Driver.findElement(By.id("UploadFile"));
		act02.moveToElement(chooseFile).click().perform();
		Thread.sleep(8000);
		uploadFile("C:\\Users\\tbutani\\Documents\\Others\\TestData\\TestData.xlsx");
		Thread.sleep(8000);
		Driver.findElement(By.id("Upload")).click();
		Thread.sleep(14000);
		// Enter in another large window again
		Driver.switchTo().window(window1);
		Thread.sleep(8000);
				
		//Submission parties-Bind contract
		Driver.findElement(By.xpath("//*[@id='RadTabStrip1']/div/ul/li[3]/a/span")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("btnCreateContract")).click();
		Thread.sleep(8000);
        //Submission workspace-Premium
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[1]/a")).click();
		Thread.sleep(5800);
		
		//Submission parties-Co-brokerage
		//Recent comment
		/*Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[3]/a")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("btnManageCoBrokerage")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("TextBox_PayawayAmount_1_1")).sendKeys("2000");
		Driver.findElement(By.id("TextBox_PayawayAmount_1_2")).sendKeys("2100");
		Driver.findElement(By.id("TextBox_PayawayAmount_1_3")).sendKeys("2200");
		Driver.findElement(By.id("TextBox_PayawayAmount_1_4")).sendKeys("2300");
		Thread.sleep(2000);
		Driver.findElement(By.id("ButtonAssociateContracts")).click();
		Thread.sleep(8000);*/
		
		//Premium
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//*[@id='objGridContracts-0-0']/a")).click();
		Thread.sleep(8000);
		
		Driver.findElement(By.xpath("//*[@id='Grid2_expcol_0']/img[1]")).click();
		Thread.sleep(4000);
		Driver.findElement(By.name("optInstallmentScheduleId")).click();
		Thread.sleep(4000);
		
		//Process Schedule
		Driver.findElement(By.id("btnCreateStatements")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("chkStatementType_0")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("CreateStatement")).click();
		Thread.sleep(18000);
		Thread.sleep(8000);
		//Click StatementID
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr[5]/td/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/"
				+ "table/tbody/tr[5]/td/div[2]/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(8000);
		//Accounting workspace-Change statement status to open
		Driver.findElement(By.id("RBListStatementStatusTypeNew_1")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("ButtonChangeStatus")).click();
		Thread.sleep(11000);
		Thread.sleep(11000);
		
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(11000);
		Driver.findElement(By.xpath("//*[@id='objGridContracts-0-0']/a")).click();
		Thread.sleep(8000);
		//Accounting-Click cancel
		Driver.findElement(By.xpath("//*[@id='TblAccounting']/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[2]/td[11]/a")).click();
		Thread.sleep(4000);
		//Enter date
		Driver.findElement(By.id("radWinTransDate_C_radDPTransDate_dateInput")).sendKeys("12/15/2022");
		Driver.findElement(By.id("radWinTransDate_C_radStmtDate_dateInput")).sendKeys("12/15/2022");
		Thread.sleep(1000);
		Driver.findElement(By.id("radWinTransDate_C_lnkSaveTransDate")).click();
		Thread.sleep(8000);
		
		// Add receipt
		//Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/Settlement/ReceiptEdit.aspx");
		Driver.findElement(By.id("Board1_ADDRECEIPT")).click();
		Thread.sleep(5800);
		Driver.findElement(By.id("ComboBoxCounterCompanies_Input")).sendKeys("African");
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='ComboBoxCounterCompanies_DropDown']/div[2]/ul/li[2]/table/tbody/tr/td[2]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.id("VoucherSubType")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='VoucherSubType']/option[3]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("VoucherName")).sendKeys("CR1");
		Thread.sleep(2000);
		Select select2 = new Select(Driver.findElement(By.id("CurrencyType")));
		Driver.findElement(By.id("CurrencyType")).click();
		Thread.sleep(1000);
		select2.selectByVisibleText("USD");
		Thread.sleep(4000);
		Driver.findElement(By.id("PaymentType")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='PaymentType']/option[10]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("VoucherAmount")).sendKeys("25000");
		Thread.sleep(1000);
		Driver.findElement(By.id("CompanySubType")).click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[@id='CompanySubType']/option[3]")).click();
		Thread.sleep(2000);
		// save
		Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[2]/tbody/tr/td[2]/a/span")).click();
		Thread.sleep(8000);
		
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(8000);
		String latestContractID=Driver.findElement(By.xpath("/html/body/form/div[12]/table/tbody/tr[2]/td[2]/div[2]/div[4]/div[2]/div[2]/"
				+ "div/div[1]/table/tbody/tr[1]/td[1]/a")).getText();
		Thread.sleep(8000);
		System.out.println("ContractID - " +latestContractID);
		Driver.findElement(By.xpath("/html/body/form/div[12]/table/tbody/tr[2]/td[2]/div[2]/div[4]/div[2]/div[2]/"
				+ "div/div[1]/table/tbody/tr[1]/td[1]/a")).click();		
		Thread.sleep(2000);
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr[5]/td/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/"
				+ "table/tbody/tr[5]/td/div[2]/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/a")).click();
		Thread.sleep(4000);
		String StatementIDPaidSett=Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/table[1]/"
				+ "tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/div/table/tbody/tr[2]/td[1]/a")).getText();
		Thread.sleep(2000);
		System.out.println("StatementID-Paid/Sett.-" +StatementIDPaidSett);
		Thread.sleep(2000);
		String StatementIDDisbursable=Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/table[1]/"
				+ "tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/div/table/tbody/tr[3]/td[1]/a")).getText();
		Thread.sleep(2000);
		System.out.println("StatementID-Disbursable-" +StatementIDDisbursable);
		Thread.sleep(2000);

		// ApplyReciept
		Driver.findElement(By.id("Board1_PAYMENTS")).click();
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//*[@id='objGridSettlements-0-1']/a")).click();
		Thread.sleep(8000);
		Driver.findElement(By.xpath("/html/body/form/div[12]/div[1]/div/div/ul/li[3]")).click();
		Thread.sleep(10000);
		Driver.findElement(By.id("TBLayerId")).sendKeys(latestContractID);
		Thread.sleep(1000);
		Driver.findElement(By.id("ButtonGetStatements")).click();
		Thread.sleep(5800);
		Driver.findElement(By.name("btnStatement")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("ButtonApplyReceipts")).click();
		Thread.sleep(14000);
		Thread.sleep(14000);
		//Verify "Open statement bal", "Bkge. due" and "other deduction" amount
		
		//Disbursement App.-Cash settlement
		Driver.findElement(By.name("btnFillAmount")).click();
		Thread.sleep(4000);
		//Apply for Disbursement
		Driver.findElement(By.id("DisburseStatements")).click();
		Thread.sleep(11000);
		
		//Settlement Workspace
		Driver.findElement(By.xpath("//*[@id='TabStrip1']/div/ul/li[1]/a/span")).click();
		Thread.sleep(11000);
		Thread.sleep(4000);
		//Verify Receipt application and Disbursement application
		String ReceiptAppVoucherID=Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/table/tbody/tr[1]/td[3]/div/a/span")).getText();
		Thread.sleep(4000);
		System.out.println("ReceiptAppVoucherID-" +ReceiptAppVoucherID);
		Thread.sleep(4000);
		Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/table/tbody/tr[1]/td[3]/div/a/span")).click();
		Thread.sleep(14000);
		String DisbursableAppVoucherID=Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[4]/div/a/span")).getText();
		Thread.sleep(4000);
		System.out.println("DisbursableAppVoucherID-" +DisbursableAppVoucherID);
		Thread.sleep(4000);
		Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[4]/div/a/span")).click();	
		Thread.sleep(8000);
		Thread.sleep(8000);
		
		try{
			Alert alt04=Driver.switchTo().alert();
			Thread.sleep(1000);
			alt04.accept();
			Thread.sleep(4000);
			
		}catch(NoAlertPresentException e){
			e.printStackTrace();
		}
		Thread.sleep(8000);
		
		//Add Disbursement tab
		Driver.findElement(By.id("Board1_ADDDISBURSEMENT")).click();
		Thread.sleep(14000);
		Driver.findElement(By.id("radioDisbursementType")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("DisbursementType")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='DisbursementType']/option[2]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("CompanyName")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='CompanyName']/option[93]")).click();
		Thread.sleep(2000);
		//Driver.findElement(By.id("VoucherId")).sendKeys(DisbursableAppVoucherID);
		Driver.findElement(By.id("VoucherId")).sendKeys("196981");
		Thread.sleep(2000);
		Driver.findElement(By.id("btnApply")).click();
		Thread.sleep(4000);
		Driver.findElement(By.id("LinkButton1")).click();
		Thread.sleep(11000);
		Thread.sleep(11000);
		
		//Contract Tab
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(21000);
		Driver.findElement(By.xpath("//*[@id='objGridContracts-0-0']/a")).click();
		Thread.sleep(18000);
		//Verify Paid/settle
		Driver.findElement(By.xpath("//*[@id='TblAccounting']/tbody/tr[3]/td/table/tbody/tr[2]/td/table/tbody/tr[3]/td[1]/a")).click();
		Thread.sleep(18000);
		
		//Add SOR
		Driver.findElement(By.id("Board1_ADDSOA")).click();
		Thread.sleep(11000);
		Driver.findElement(By.id("StatementOfAccountType_3")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("ComboBoxCompanies_Input")).sendKeys("MEGA TRUST");
		Thread.sleep(2000);
		//Driver.findElement(By.xpath("/html/body/form/div[3]/table/tbody/tr[2]/td/div/div[2]/nobr/table/tbody/tr/td[2]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("txtLayerId")).sendKeys("3434784");
		//Driver.findElement(By.id("txtLayerId")).sendKeys(latestContractID);
		Thread.sleep(2000);
		Driver.findElement(By.id("btnApplyFilter")).click();
		Thread.sleep(8000);
		Thread.sleep(8000);
		
		//Need to add here
		//Line-110
		Driver.findElement(By.id("SaveAndAprove")).click();
		Thread.sleep(8000);
		Thread.sleep(8000);
		
		//Remit. Stmt. Tab
		Driver.findElement(By.id("Board1_COMPANYSTMTS")).click();
		Thread.sleep(14000);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[3]/select")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[3]/select/option[5]")).click();
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(5800);
		Driver.findElement(By.xpath("//*[@id='divGridCompanyStatements']/div[2]/div/div[2]/div[1]/div/div[9]/div[1]")).click();
		Thread.sleep(8000);
		//Click Remit. StmtID
		String RemitStmtID=Driver.findElement(By.linkText("33042")).getText();
		Thread.sleep(4000);
		System.out.println("RemitStmtID-" +RemitStmtID);
		Thread.sleep(2000);
		Driver.findElement(By.linkText("33042")).click();
		Thread.sleep(8000);
		Thread.sleep(8000);
		//Click Disburse Btn
		Driver.findElement(By.id("")).click();
		//Please add Line 115
		Driver.findElement(By.id("Board1_CONTRACTS")).click();
		Thread.sleep(8000);
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//*[@id='objGridContracts-0-0']/a")).click();
		Thread.sleep(14000);
		//Please add Line 116
		
		//Add Disbursement
		Driver.findElement(By.id("Board1_ADDDISBURSEMENT")).click();
		Thread.sleep(8000);
		Driver.findElement(By.id("radioSOA")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("StatementOfAccountId")).sendKeys(RemitStmtID);
		//Or Driver.findElement(By.id("StatementOfAccountId")).sendKeys(33042);
		Thread.sleep(2000);
		Driver.findElement(By.id("btnApply")).click();
		Thread.sleep(5800);
		
		
		
			
		//Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td/"
		//		+ "table/tbody/tr/td[1]/div/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[2]/td[15]/div/input")).click();
		//Thread.sleep(2000);
		//Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td/"
		//		+ "table/tbody/tr/td[1]/div/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td[15]/div/input")).click();
		//Thread.sleep(2000);
		//Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td/"
		//		+ "table/tbody/tr/td[1]/div/table[2]/tbody/tr[1]/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[4]/td[15]/div/input")).click();
		//Thread.sleep(2000);
		
		 // String ExpectedStatus4 = "0.00"; String ActualStatus4 =
		 // Driver.findElement(By.xpath(
		 // "/html/body/form/div[13]/div[2]/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr/td[1]/div/table[2]/tbody/tr[2]/td/table/tbody/tr[2]/td[4]/input"
		 // )).getText(); System.out.println(ActualStatus4);
		 // Assert.assertEquals(ExpectedStatus4, ActualStatus4);
		 // Thread.sleep(5000);

		// Applyreciept btn
		/*Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td/"
				+ "table/tbody/tr/td[1]/div/table[2]/tbody/tr[3]/td/table/tbody/tr[2]/td[2]/a/span")).click();
		Thread.sleep(10000);

		// Apply disburment details

		Driver.findElement(By.xpath("//*[@id='GridVoucherDisbursements_row_0']/td[3]/div/input")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridVoucherDisbursements_row_1']/td[3]/div/input")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='GridVoucherDisbursements_row_2']/td[3]/div/input")).click();
		Thread.sleep(2000);

		// Apply disbursment btn
		Driver.findElement(By.xpath("//*[@id='DisburseStatements']/span")).click();
		Thread.sleep(10000);

		// Settlement Workspace
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[1]/div/ul/li[1]/a/span")).click();
		Thread.sleep(5000);

		// plus1
		// Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[2]/td[1]/img[1]")).click();
		// plus2
		// Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/table/tbody/tr[1]/td[2]/img[1]")).click();

		String Voucher1 = Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/"
				+ "table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[1]/td[4]/div/a/span")).getText();
		System.out.println(Voucher1);

		String Voucher2 = Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/"
				+ "table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[4]/div/a/span")).getText();
		System.out.println(Voucher2);

		String Voucher3 = Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[2]/table/tbody/tr/td/"
				+ "table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr[3]/td/div/table/tbody/tr[2]/td/div/table/tbody/tr[3]/td[4]/div/a/span")).getText();
		System.out.println(Voucher3);

		// Add disbursemnet icon
		// Voucher1
		Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/Settlement/AddDisbursement.aspx");
		Thread.sleep(8000);
		Driver.findElement(By.id("radioDisbursementType")).click();
		Thread.sleep(5000);

		Select Select3 = new Select(Driver.findElement(By.id("DisbursementType")));
		Driver.findElement(By.id("DisbursementType")).click();
		Thread.sleep(2000);
		Select3.selectByValue("D");
		Thread.sleep(6000);

		Driver.findElement(By.id("VoucherId")).click();
		Driver.findElement(By.id("VoucherId")).sendKeys(Voucher1);

		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr[8]/td[4]/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(5000);

		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[2]/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr[13]/td[3]/div/a/span")).click();
		Thread.sleep(5000);

		// Voucher2
		Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/Settlement/AddDisbursement.aspx");
		Thread.sleep(8000);
		Driver.findElement(By.id("radioDisbursementType")).click();
		Thread.sleep(5000);

		Select Select4 = new Select(Driver.findElement(By.id("DisbursementType")));
		Driver.findElement(By.id("DisbursementType")).click();
		Select4.selectByValue("D");
		Thread.sleep(5000);

		Driver.findElement(By.id("VoucherId")).click();
		Driver.findElement(By.id("VoucherId")).sendKeys(Voucher2);

		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr[8]/td[4]/table/tbody/tr/td[2]/a")).click();
		Thread.sleep(5000);

		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[2]/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr[13]/td[3]/div/a/span")).click();
		Thread.sleep(5000);

		// Add SOR
		// Voucher3

		Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/StatementOfAccount/StatementofAccountAdd.aspx");
		Thread.sleep(8000);
		Driver.findElement(By.id("StatementOfAccountType_0")).click();
		Thread.sleep(5000);

		Select Select5 = new Select(Driver.findElement(By.id("CompanyTypes")));
		Driver.findElement(By.id("CompanyTypes")).click();
		Select5.selectByValue("REINSURER");
		Thread.sleep(5000);

		Driver.findElement(By.id("ComboBoxCompanies_Input")).click();
		Driver.findElement(By.id("ComboBoxCompanies_Input")).sendKeys("Test Company");
		Thread.sleep(8000);
		Driver.findElement(By.xpath("//*[@id='ComboBoxCompanies_item_1']/nobr/table/tbody/tr/td[2]")).click();
		Thread.sleep(5000);
		Driver.findElement(By.id("txtLayerId")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("txtLayerId")).sendKeys(latestContractid);
		
		//Filter
		
		Driver.findElement(By.id("btnApplyFilter")).click();
		Thread.sleep(10000);
		
		//SelectAllbtn
		Driver.findElement(By.id("SelectAllREINSURERUSD")).click();
		Thread.sleep(5000);
		//Save & approve
		
		Driver.findElement(By.xpath("//*[@id='SaveAndAprove']/span")).click();
		Thread.sleep(15000);
		
		// edit for add Premium adjustment

		Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/MainPage/DefaultDE.aspx?ItemId=CONTRACTS");
		Thread.sleep(15000);
		Driver.findElement(By.xpath("/html/body/form/div[12]/table/tbody/tr[2]/td[2]/div[2]/div[4]/div[2]/div[2]/div/div[1]/"
				+ "table/tbody/tr[1]/td[1]/a")).click();
		Thread.sleep(15000);
		Driver.findElement(By.xpath("//*[@id='Grid2_row_0']/td[2]/a")).click();
		//Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr[4]/td/table/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr[3]/td/table/tbody/tr/td/div/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table[1]/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).click();
		Thread.sleep(15000);

		Driver.findElement(By.id("Edit2")).click();
		Thread.sleep(5000);
		Driver.findElement(By.id("LinkButton1")).click();
		Thread.sleep(2000);
		Driver.findElement(By.id("Grid1_EditTemplate_0_2_Reinsurers12_ComboBox1_Input")).clear();
		Driver.findElement(By.id("Grid1_EditTemplate_0_2_Reinsurers12_ComboBox1_Input")).sendKeys("Premium Adjustment");
		Thread.sleep(2000);

		// adjustment End period Date
		Driver.findElement(By.id("calendar_from_buttonEnd")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='Grid1_EditTemplate_0_4_CalendarEDate_HeaderTd']/table/tbody/tr/td/table/tbody/tr/td[3]/"
				+ "table/tbody/tr/td[3]/img")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id='Grid1_EditTemplate_0_4_CalendarEDate_HeaderTd']/table/tbody/tr/td/table/tbody/tr/td[5]/"
				+ "table/tbody/tr[2]/td/img")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("/html/body/form/span[8]/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[3]/"
				+ "table/tbody/tr/td[3]/img")).click();
		Thread.sleep(4000);
		// insert
		Driver.findElement(By.xpath("/html/body/form/span[8]/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr/td/"
				+ "table/tbody/tr[7]/td[2]")).click();
		Thread.sleep(4000);

		// Adjustment Date

		Driver.findElement(By.id("calendar_from_buttonAdj")).click();
		Thread.sleep(4000);
		Driver.findElement(By.xpath("/html/body/form/span[7]/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[5]/"
				+ "table/tbody/tr[2]/td/img")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("/html/body/form/span[7]/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[3]/"
				+ "table/tbody/tr/td[3]/img")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("/html/body/form/span[7]/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td[3]/"
				+ "table/tbody/tr/td[3]/img")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("/html/body/form/span[7]/div[1]/table/tbody/tr[2]/td/div/table/tbody/tr/td/table/tbody/tr/td/"
				+ "table/tbody/tr[5]/td[2]")).click();
		Thread.sleep(2000);

		Driver.findElement(By.xpath("/html/body/form/div[22]/div[2]/div/div[1]/table/tbody/tr/td[1]/table[3]/tbody/tr[2]/td/"
				+ "table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr[6]/td[8]/div/input")).sendKeys("Prem Adj as at May 17 2021");

		// insert
		Driver.findElement(By.xpath("/html/body/form/div[22]/div[2]/div/div[1]/table/tbody/tr/td[1]/table[3]/tbody/tr[2]/td/"
				+ "table/tbody/tr[6]/td/table/tbody/tr/td/table/tbody/tr[6]/td[12]/div/a[1]")).click();
		Thread.sleep(2000);

		// premium section name
		Driver.findElement(By.xpath("/html/body/form/div[22]/div[2]/div/div[1]/table/tbody/tr/td[1]/table[5]/tbody/tr/td[1]/"
				+ "table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[3]/input")).clear();
		Driver.findElement(By.xpath("/html/body/form/div[22]/div[2]/div/div[1]/table/tbody/tr/td[1]/table[5]/tbody/tr/td[1]/"
				+ "table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[3]/input")).sendKeys("Premium Adjustment P1");
		Thread.sleep(4000);
		Driver.findElement(By.xpath("/html/body/form/div[22]/div[2]/div/div[1]/table/tbody/tr/td[1]/table[1]/tbody/tr/td[2]/a/span")).click();
		Thread.sleep(10000);

		// plus
		Driver.findElement(By.xpath("//*[@id='Grid2_expcol_0']/img[1]")).click();
		Thread.sleep(2000);
		// radio button premium schedule
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr[5]/td/table/tbody/tr[2]/td[1]/table/tbody/tr[2]/td[2]/"
				+ "table/tbody/tr[4]/td/table/tbody/tr[2]/td/div/div/table/tbody/tr[3]/td/table/tbody/tr[2]/td/table[1]/tbody/tr/td/table/tbody/tr[3]/td/div/table/tbody/tr[6]/td[3]/div/input")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr[4]/td/table/tbody/tr/td[1]/table/tbody/tr/td[2]/"
				+ "table/tbody/tr[3]/td/table/tbody/tr/td/div/div/table/tbody/tr[2]/td/table/tbody/tr[1]/td/a[3]")).click();
		Thread.sleep(10000);
		Driver.findElement(By.xpath("/html/body/form/div[1]/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/"
				+ "table/tbody/tr/td/div[1]/table/tbody/tr[3]/td/input")).click();
		Thread.sleep(10000);
		Driver.findElement(By.xpath("/html/body/form/div[1]/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/"
				+ "table/tbody/tr/td/div[1]/div/table/tbody/tr/td[3]/a")).click();
		Thread.sleep(20000);

		Driver.navigate().refresh();
		Thread.sleep(10000);
		// Fixed manual statement
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr[4]/td/table/tbody/tr/td[1]/table/tbody/tr/td[2]/"
				+ "table/tbody/tr[4]/td/div[2]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(15000);
		Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/Statements/StatementProcessing.aspx");
		Thread.sleep(10000);

		Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[1]/table[2]/tbody/tr/td/table/tbody/tr/td/"
				+ "table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[3]/input")).sendKeys(Keys.chord(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE));
		Thread.sleep(2000);
		Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[1]/table[2]/tbody/tr/td/table/tbody/tr/td/"
				+ "table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[3]/input")).sendKeys("5500");
		Thread.sleep(2000);
		// save
		Driver.findElement(By.id("SaveStmts")).click();
		Thread.sleep(10000);
		// accounting workspace tab
		Driver.findElement(By.xpath("/html/body/form/div[12]/div[1]/div/ul/li[1]/a/span")).click();
		Thread.sleep(5000);
		// open
		Driver.findElement(By.id("RBListStatementStatusTypeNew_1")).click();
		Thread.sleep(2000);
		// change status
		Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr/td/"
				+ "table[1]/tbody/tr[2]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/div/table/tbody/tr[1]/td[3]/a/span")).click();
		Thread.sleep(10000);

		// verification for CE
		Driver.navigate().refresh();
		Thread.sleep(10000);
		Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/"
				+ "table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/div/table/tbody/tr[3]/td[1]/a")).click();
		Thread.sleep(10000);
		// 5500*60%=3300
		// 5000*60%=3000
		// 5500-5000=300

		String Expectedline0 = "3,300.00";
		String Expectedline5 = "3,000.00";
		String Expectedline10 = "300.00";
		String ActualLine0 = Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[2]/"
				+ "table/tbody/tr/td/table[2]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[2]/td[4]")).getText();
		String ActualLine5 = Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[2]/"
				+ "table/tbody/tr/td/table[2]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[3]/td[4]")).getText();
		String ActualLine10 = Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[2]/"
				+ "table/tbody/tr/td/table[2]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[4]/td[4]")).getText();
		System.out.println(ActualLine0);
		System.out.println(ActualLine5);
		System.out.println(ActualLine10);
		Thread.sleep(10000);
		Assert.assertEquals(Expectedline0, ActualLine0);
		Thread.sleep(10000);
		Assert.assertEquals(Expectedline5, ActualLine5);
		Thread.sleep(10000);
		Assert.assertEquals(Expectedline10, ActualLine10);
		Thread.sleep(10000);

		// verification for RE
		Driver.navigate().refresh();
		Thread.sleep(10000);
		Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/"
				+ "table[1]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/div/table/tbody/tr[4]/td[1]/a")).click();
		Thread.sleep(10000);
		String ExpectedLine140 = "240.00";
		String ActualLine140 = Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[2]/"
				+ "table/tbody/tr/td/table[2]/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr[8]/td[4]")).getText();
		Thread.sleep(8000);
		System.out.print(ActualLine140);
		Assert.assertEquals(ExpectedLine140, ActualLine140);
		Thread.sleep(8000);

		// Again Contract
		Driver.findElement(By.xpath("/html/body/form/div[14]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td[1]/table/tbody/tr/td/"
				+ "table[1]/tbody/tr[2]/td/table/tbody/tr/td/table[1]/tbody/tr/td[2]/table/tbody/tr[3]/td/a/span")).click();
		Thread.sleep(10000);
		// Select layer id
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr[4]/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/"
				+ "table/tbody/tr[4]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/table/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(2000);
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr[4]/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/"
				+ "table/tbody/tr[4]/td/table/tbody/tr[2]/td/table/tbody/tr[1]/td/a[3]/span")).click();
		Thread.sleep(5000);

		// add claim from layer id
		Driver.findElement(By.id("ClaimName")).sendKeys("May's Food Company 5/1/2021");
		Thread.sleep(5000);
		// date of loss
		Driver.findElement(By.id("LossDate_dateInput")).sendKeys("5/1/2021");
		Thread.sleep(2000);
		// save
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table[1]/tbody/tr/td[1]/table[2]/tbody/tr/td[2]/a/span")).click();
		Thread.sleep(30000);

		Driver.navigate().refresh();
		Thread.sleep(10000);

		Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/Claims/AddClaimFigures.aspx");
		Thread.sleep(15000);
		// ADD 1st CFT
		Driver.findElement(By.id("OSLoss")).click();
		Driver.findElement(By.id("OSLoss")).sendKeys(Keys.chord(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE));
		Thread.sleep(2000);
		Driver.findElement(By.id("OSLoss")).sendKeys("10000");
		// OS LAE unknown check box
		Driver.findElement(By.id("TestOSLAEUnknown")).click();
		Thread.sleep(2000);
		// save
		Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[2]/td/table[3]/tbody/tr/td/table[2]/tbody/tr/td[1]/a/span")).click();
		Thread.sleep(10000);
		// ADD 2nd CFT
		Driver.findElement(By.id("PaidLoss")).click();
		Driver.findElement(By.id("PaidLoss")).sendKeys(Keys.chord(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE));
		Driver.findElement(By.id("PaidLoss")).sendKeys("4000");
		Thread.sleep(2000);
		Driver.findElement(By.id("OSLoss")).click();
		Driver.findElement(By.id("OSLoss")).sendKeys(Keys.chord(Keys.DELETE, Keys.DELETE, Keys.DELETE, Keys.DELETE));
		Driver.findElement(By.id("OSLoss")).sendKeys("6000");
		Thread.sleep(2000);
		// OS LAE unknown check box
		Driver.findElement(By.id("TestOSLAEUnknown")).click();
		Thread.sleep(2000);
		// save
		Driver.findElement(By.xpath("/html/body/form/div[12]/div[2]/table[1]/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr/td/table[2]/tbody/tr[2]/td/table[3]/tbody/tr/td/table[2]/tbody/tr/td[1]/a/span")).click();
		Thread.sleep(10000);

		// Process Claim Tab
		Driver.navigate().to("http://10.30.139.92/PivotPointV2Web/Modules/Claims/ClaimWorksheetNew2.aspx");
		Thread.sleep(20000);
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table/tbody/tr/td[1]/table[2]/tbody/tr/td/table/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[12]/div/input")).click();
		Thread.sleep(15000);

		
		 // //verify line 110= 4000 String ExpectedClaimline110 = "4,000.00";
		 // String ActualClaimline110 = Driver.findElement(By.xpath(
		 // "/html/body/form/div[13]/div[2]/table/tbody/tr/td[1]/table[3]/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td/table/tbody/tr[2]/td/div/table/tbody/tr[17]/td[4]/div/input"
		 // )).getText(); System.out.println(ActualClaimline110);
		 // Assert.assertEquals(ExpectedClaimline110, ActualClaimline110);
		 // Thread.sleep(5000);
		 

		// Process claim w/s

		Thread.sleep(5000);
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table/tbody/tr/td[1]/table[2]/tbody/tr/td/table/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[12]/div/input")).click();
		Thread.sleep(15000);
		// Claim Statement POP up
		Driver.findElement(By.xpath("/html/body/form/div[13]/div[2]/table/tbody/tr/td[1]/table[2]/tbody/tr/td/table/tbody/tr[2]/td/"
				+ "table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr[2]/td[13]/div/input")).click();
		Thread.sleep(15000);
		// Claim notice/Statement Type

		Select ClaimnoticeStatementType = new Select(Driver.findElement(By.id("ClaimStatementType")));
		Thread.sleep(15000);
		Driver.findElement(By.id("ClaimStatementType")).click();
		Thread.sleep(5000);
		ClaimnoticeStatementType.selectByVisibleText("Partial Payment");
		Thread.sleep(15000);
		// Process Statement
		Driver.findElement(By.id("CreateStatement")).click();
		Thread.sleep(10000);
		// Back button
		Driver.findElement(By.id("CancelStatement")).click();
		Thread.sleep(15000);
		
		System.out.println("Script completed as expected");
		Thread.sleep(5000);
		
		Driver.quit();*/
		
		
		
		
	}

	public static void setClipBoard(String file) {

		StringSelection obj = new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}

	public static void uploadFile(String filePath) throws AWTException {

		setClipBoard(filePath);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	
		
	}

}
