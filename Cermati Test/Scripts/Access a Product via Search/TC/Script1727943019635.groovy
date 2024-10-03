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
//open url ebay
WebUI.navigateToUrl('https://www.ebay.com/')
//Sorting MacBook
WebUI.setText(findTestObject('Object Repository/Page_Electronics, Cars, Fashion, Collectibl_475ffe/input_Enter your search keyword__nkw'), 
    'MacBook')

WebUI.click(findTestObject('Object Repository/Page_Electronics, Cars, Fashion, Collectibl_475ffe/input_macbook_gh-btn'))

//klik category Computer/Tablet & Networking
WebUI.click(findTestObject('Object Repository/Page_MacBook for sale  eBay/span_ComputersTablets  Networking'))
WebUI.click(findTestObject('Object Repository/Page_MacBook in ComputersTablets  Networkin_e89342/input_Enter your search keyword_gh-btn'))

//Verify load page complete
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MacBook in ComputersTablets  Networkin_e89342/span_Selected categoryComputersTablets  Networking'), 
    0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_MacBook in ComputersTablets  Networkin_e89342/span_EXCELLENT Apple MacBook Air 11 HIGH DE_e2538a'), 
    'EXCELLENT Apple MacBook Air 11" HIGH DEF INTEL CORE i5 512GB SSD')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_MacBook in ComputersTablets  Networkin_e89342/span_EXCELLENT Apple MacBook Air 11 HIGH DE_e2538a'), 
    0)
WebUI.closeBrowser()

