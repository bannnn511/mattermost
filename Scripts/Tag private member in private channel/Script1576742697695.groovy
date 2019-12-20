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

WebUI.navigateToUrl('https://mattermost-usecase.herokuapp.com')

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_703ef5'), 'bannnnn')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    '6M8jdlTs8n6rOnocPaG5Cw==')

WebUI.click(findTestObject('Object Repository/Page_Mattermost/span_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - test-case Mattermost/span_Test create private channel'))

WebUI.click(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/span_Invite others to this private channel'))

WebUI.click(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/div_h13uct'))

WebUI.click(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_Write to Test create private chann_a08f9f'), 
    '@')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_'), '@h')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_h'), '@hi')

WebUI.click(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/span_- new name (NAme)'))

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_hieudz123'), 
    '@hieudz123')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_hieudz123_1'), 
    '@hieudz12')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_hieudz12'), 
    '@hieudz1')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_hieudz1'), '@hieudz')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_hieudz'), '@hieud')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_hieud'), '@hieu')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_hieu'), '@hie')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_hie'), '@hi')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_hi'), '@h')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_h'), '@')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_'), '')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_Write to Test create private chann_a08f9f'), 
    '@')

WebUI.click(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/div_h13uct_1'))

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_h13uct'), '@h13uct h')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_h13uct h'), 
    '@h13uct he')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_h13uct he'), 
    '@h13uct hel')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_h13uct hel'), 
    '@h13uct hell')

WebUI.setText(findTestObject('Object Repository/Page_Test create private channel - test-cas_2f9e36/textarea_h13uct hell'), 
    '@h13uct hello')

WebUI.closeBrowser()

