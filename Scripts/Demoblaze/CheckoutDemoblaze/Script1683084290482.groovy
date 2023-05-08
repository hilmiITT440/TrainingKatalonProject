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

WebUI.navigateToUrl('https://www.demoblaze.com/')

WebUI.click(findTestObject('Object Repository/Page_STORE/Page_STORE/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/Page_STORE/input_Username_loginusername'), 'supermassiveblackhole')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_STORE/Page_STORE/input_Password_loginpassword'), '3YEZ0K1UVUHz5DHfz80Rxw==')

WebUI.click(findTestObject('Object Repository/Page_STORE/Page_STORE/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_STORE/Page_STORE/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/Page_STORE/Page_STORE/a_Add to cart'))

WebUI.verifyAlertPresent(0)

WebUI.getAlertText()

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/Page_STORE/Page_STORE/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_STORE/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Page_STORE/Page_STORE/input_Name_name'), 'supermassiveblackhole')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Page_STORE/input_Country_country'), 'Japan')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Page_STORE/input_City_city'), 'TOkyo')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Page_STORE/input_Credit card_card'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Page_STORE/input_Month_month'), '1')

WebUI.setText(findTestObject('Object Repository/Page_STORE/Page_STORE/input_Year_year'), '2099')

WebUI.click(findTestObject('Object Repository/Page_STORE/Page_STORE/button_Purchase'))

WebUI.rightClick(findTestObject('Object Repository/Page_STORE/Page_STORE/div_PRODUCT STORE_sa-placeholder'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_STORE/Page_STORE/h2_Thank you for your purchase'), 0)

WebUI.click(findTestObject('Object Repository/Page_STORE/Page_STORE/button_OK'))

