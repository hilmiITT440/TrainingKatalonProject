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

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_firstName'), 'Haha')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Name_lastName'), 'KIm')

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), 'test123@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Female'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_(10 Digits)_userNumber'), '0111123456')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/input_Date of Birth_dateOfBirthInput'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_190019011902190319041905190619071908_246ee1'), 
    '2006', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_DEMOQA/select_JanuaryFebruaryMarchAprilMayJuneJuly_566629'), 
    '7', true)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_1'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Subjects_subjects-auto-complete__value-_d244cf'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Subjects_subjectsInput'), 'Maths')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Maths'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/label_Reading'))

WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/textarea_Current Address_currentAddress'), 'Malaysia')

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Haryana'))

WebUI.click(findTestObject('Page_DEMOQA/div_Haryana'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/form_NameEmailGenderMaleFemaleOtherMobile(1_53b2a4'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/div_Karnal'))

WebUI.click(findTestObject('Page_DEMOQA/div_Karnal'))

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))

WebUI.rightClick(findTestObject('Object Repository/Page_DEMOQA/div_Thanks for submitting the form'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_DEMOQA/div_Thanks for submitting the form'), 0)

WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Close'))

