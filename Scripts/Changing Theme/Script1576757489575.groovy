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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermost-usecase.herokuapp.com/')

WebUI.setText(findTestObject('Object Repository/Edit Account Full Name With All Fields Filled/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'hieuminhnguyen95@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Edit Account Full Name With All Fields Filled/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    'MkITpGSjdNjAaKH8FIw/Og==')

WebUI.click(findTestObject('Object Repository/Edit Account Full Name With All Fields Filled/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_Town Square - Squad Mattermost/button_hieudz123_style--none sidebar-header_f9a64e'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_Town Square - Squad Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/img_Theme Colors_img-responsive'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Close'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/img_Mattermost_img-responsive'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/span_'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_ase_style--none sidebar-header-dropd_cea3e5'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/img_Organization_img-responsive'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Save'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Close'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/button_Display'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/span_Edit'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/img_Mattermost Dark_img-responsive'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/span_Save'))

WebUI.click(findTestObject('Object Repository/Changing Theme/Page_(2) Town Square - Rednit Mattermost/span_'))

WebUI.closeBrowser()

