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

WebUI.setText(findTestObject('Object Repository/Private channel/Add description private channel/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'bannnnn')

WebUI.setEncryptedText(findTestObject('Object Repository/Private channel/Add description private channel/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    '6M8jdlTs8n6rOnocPaG5Cw==')

WebUI.click(findTestObject('Object Repository/Private channel/Add description private channel/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Private channel/Add description private channel/Page_(3) Town Square - Rednit Mattermost/li_PRIVATE CHANNELS'))

WebUI.click(findTestObject('Object Repository/Private channel/Add description private channel/Page_(3) Town Square - Rednit Mattermost/span_Test create private channel'))

WebUI.click(findTestObject('Object Repository/Private channel/Add description private channel/Page_(3) Test create private channel - Redn_9fffd9/span_Add a channel description'))

WebUI.setText(findTestObject('Object Repository/Private channel/Add description private channel/Page_(3) Test create private channel - Redn_9fffd9/textarea_Edit the Channel Header_edit_textbox'), 
    't')

WebUI.setText(findTestObject('Object Repository/Private channel/Add description private channel/Page_(3) Test create private channel - Redn_9fffd9/textarea_t'), 
    'te')

WebUI.setText(findTestObject('Object Repository/Private channel/Add description private channel/Page_(3) Test create private channel - Redn_9fffd9/textarea_te'), 
    'tes')

WebUI.setText(findTestObject('Object Repository/Private channel/Add description private channel/Page_(3) Test create private channel - Redn_9fffd9/textarea_tes'), 
    'test')

WebUI.click(findTestObject('Object Repository/Private channel/Add description private channel/Page_(3) Test create private channel - Redn_9fffd9/span_Save'))

WebUI.closeBrowser()

