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

WebUI.navigateToUrl('https://www.saucedemo.com/')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_user-name'), user_name)

WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), password)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Swag Labs_login-button'))

//WebUI.verifyElementText(findTestObject('Page_Swag Labs/div_29.99'), actualValue)
actualValue = WebUI.getText(findTestObject('Object Repository/Page_Swag Labs/div_29.99'))

println(actualValue)

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Remove'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/a_1'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_29.99'), actualValue)
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_firstName'), 'sauce')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_lastName'), 'sauce2')

WebUI.setText(findTestObject('Object Repository/Page_Swag Labs/input_Checkout Your Information_postalCode'), '12345')

WebUI.click(findTestObject('Object Repository/Page_Swag Labs/input_Cancel_continue'))

expectedvalue1 = WebUI.getText(findTestObject('Object Repository/Page_Swag Labs/div_29.99'))

println(expectedvalue1)

expectedvalue2 = WebUI.getText(findTestObject('Object Repository/Page_Swag Labs/div_Total 32.39'))

println(expectedvalue2)

//before tax
WebUI.verifyEqual(actualValue, expectedvalue1)

//after tax
WebUI.verifyNotEqual(actualValue, expectedvalue2)

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/div_Total 32.39'), 'Total: $32.39')
WebUI.click(findTestObject('Object Repository/Page_Swag Labs/button_Finish'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Swag Labs/h2_Thank you for your order'), 'Thank you for your order!')

WebUI.closeBrowser()

