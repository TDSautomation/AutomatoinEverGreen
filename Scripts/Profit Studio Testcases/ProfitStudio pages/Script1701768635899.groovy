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

WebUI.navigateToUrl('https://members.profitstudio.com/accounts')

WebUI.click(findTestObject('Object Repository/Page_Profit Studio - Sign In/input_Contact Support_email'))

WebUI.setText(findTestObject('Object Repository/Page_Profit Studio - Sign In/input_Contact Support_email'), 'muhammad.junaidkhalid78+testps@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Profit Studio - Sign In/input_Contact Support_password'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Profit Studio - Sign In/input_Forgot Password_loginbtn'))

WebUI.click(findTestObject('Object Repository/Page_Profit Studio - Dashboard/a_cls-jupcom         fill 786ea4        fil_bfddec'))
WebUI.delay(15)
WebUI.verifyElementText(findTestObject('Object Repository/Page_Profit Studio - Top Sellers (JVZoo)/h1_Top Sellers (JVZoo)'), 
    'Top Sellers (JVZoo)')

WebUI.click(findTestObject('Object Repository/Page_Profit Studio - Top Sellers (JVZoo)/a_Videos_btn btn-flip-action btn-filter-act_113b77'))
WebUI.delay(15)
WebUI.verifyElementText(findTestObject('Object Repository/Page_Profit Studio - Top Sellers (ClickBank)/h1_Top Sellers (ClickBank)'), 
    'Top Sellers (ClickBank)')

WebUI.click(findTestObject('Object Repository/Page_Profit Studio - Top Sellers (ClickBank)/img'))
WebUI.delay(15)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Profit Studio - Top Sellers (WarriorPlus)/h1_Top Sellers (WarriorPlus)'), 
    'Top Sellers (WarriorPlus)')

WebUI.closeBrowser()

