import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
//open browser
WebUI.navigateToUrl('https://www.ebay.com/')
//navigate to category>electronic>cell phones & accessories
WebUI.click(findTestObject('Object Repository/Page_Electronics, Cars, Fashion, Collectibl_475ffe/html_root   --border-radius-50 8px  --borde_1e3977'))
WebUI.click(findTestObject('Object Repository/Page_Electronics, Cars, Fashion, Collectibl_475ffe/button_Shop by category'))
WebUI.click(findTestObject('Object Repository/Page_Electronics, Cars, Fashion, Collectibl_475ffe/a_Cell phones  accessories'))
WebUI.click(findTestObject('Object Repository/Page_Cell Phones, Smartphones, Smart Watche_d1fc43/a_Cell Phones  Smartphones'))
// clik all filters
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/button_All Filters'))
//clik condition
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/div_Condition'))

WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/input_Condition_c3-subPanel-LH_ItemConditio_4a9678'))
//clik price and fill range price
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/div_Price'))

WebUI.setText(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/input_IDR_x-textrange__input x-textrange__i_f04732'), 
    '10000000')
//click location
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/div_Item Location'))
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/input_Europe_location'))
WebUI.click(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/button_Apply'))
//verify tag emelement
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cell Phones  Smartphones for Sale - Bu_63dd06/span_Cell Phones  Smartphones between IDR1,_99088e'), 
    0)

WebUI.closeBrowser()

