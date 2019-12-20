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

WebUI.setText(findTestObject('Object Repository/Private channel/View private channel info/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'bannnnn')

WebUI.setEncryptedText(findTestObject('Object Repository/Private channel/View private channel info/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    '6M8jdlTs8n6rOnocPaG5Cw==')

WebUI.click(findTestObject('Object Repository/Private channel/View private channel info/Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Private channel/View private channel info/Page_(3) Town Square - Rednit Mattermost/span_Test create private channel'))

WebUI.click(findTestObject('Object Repository/Private channel/View private channel info/Page_(3) Test create private channel - Redn_9fffd9/span_Test create private channel_channelHea_71aa01'))

WebUI.click(findTestObject('Object Repository/Private channel/View private channel info/Page_(3) Test create private channel - Redn_9fffd9/button_View Info'))

WebUI.click(findTestObject('Object Repository/Private channel/View private channel info/Page_(3) Test create private channel - Redn_9fffd9/span_'))

WebUI.closeBrowser()

