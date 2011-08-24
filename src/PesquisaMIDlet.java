/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.OutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SimpleTableModel;
import org.netbeans.microedition.lcdui.TableItem;

import org.kxml2.kdom.Document;
import org.kxml2.kdom.Element;
import org.kxml2.io.KXmlParser;
import org.kxml2.io.KXmlSerializer;
import org.kxml2.kdom.Node;
import org.netbeans.microedition.lcdui.pda.FileBrowser;
import org.xmlpull.v1.XmlSerializer;
/**
 * @author petronio
 */
public class PesquisaMIDlet extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;
    
    /**
     * Essa variável irá simular um banco de dados em memória, contendo todos os "questionários" que foram respondidos
     */ 
    private Vector db = new Vector();
    
    KXmlParser parser = new KXmlParser();
    Document doc = new Document();
    KXmlSerializer serializer = new KXmlSerializer();
   

//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
private List Principal;
private Form InserirDados;
private ChoiceGroup Sexo;
private DateField dateField;
private TextField textField;
private Form VisualizarDados;
private TableItem tableItem;
private Form ExportarDados;
private FileBrowser fileBrowser;
private Command exitCommand;
private Command Salvar;
private Command Voltar;
private Command itemCommand;
private Command exitCommand1;
private Command exitCommand2;
private SimpleTableModel simpleTableModel;
//</editor-fold>//GEN-END:|fields|0|
    /**
     * The PesquisaMIDlet constructor.
     */
    public PesquisaMIDlet() {
      
    }

   

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|
//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
/**
 * Initializes the application.
 * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
 */
private void initialize () {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
/**
 * Performs an action assigned to the Mobile Device - MIDlet Started point.
 */
public void startMIDlet () {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable (null, getPrincipal ());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
/**
 * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
 */
public void resumeMIDlet () {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
/**
 * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
 * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
 * @param nextDisplayable the Displayable to be set
 */
public void switchDisplayable (Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay ();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
if (alert == null) {
display.setCurrent (nextDisplayable);
} else {
display.setCurrent (alert, nextDisplayable);
}//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|
 String xml;
//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
/**
 * Called by a system to indicated that a command has been invoked on a particular displayable.
 * @param command the Command that was invoked
 * @param displayable the Displayable where the command was invoked
 */
public void commandAction (Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
 // write pre-action user code here
if (displayable == ExportarDados) {//GEN-BEGIN:|7-commandAction|1|48-preAction
if (command == exitCommand1) {//GEN-END:|7-commandAction|1|48-preAction
 // write pre-action user code here
//GEN-LINE:|7-commandAction|2|48-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|3|32-preAction
} else if (displayable == InserirDados) {
if (command == Salvar) {//GEN-END:|7-commandAction|3|32-preAction
                Save();
switchDisplayable (null, getPrincipal ());//GEN-LINE:|7-commandAction|4|32-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|5|16-preAction
} else if (displayable == Principal) {
if (command == List.SELECT_COMMAND) {//GEN-END:|7-commandAction|5|16-preAction
 // write pre-action user code here
PrincipalAction ();//GEN-LINE:|7-commandAction|6|16-postAction
 // write post-action user code here
} else if (command == exitCommand) {//GEN-LINE:|7-commandAction|7|28-preAction
 // write pre-action user code here
exitMIDlet ();//GEN-LINE:|7-commandAction|8|28-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|9|43-preAction
} else if (displayable == VisualizarDados) {
if (command == Voltar) {//GEN-END:|7-commandAction|9|43-preAction
 // write pre-action user code here
//GEN-LINE:|7-commandAction|10|43-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|53-preAction
} else if (displayable == fileBrowser) {
if (command == FileBrowser.SELECT_FILE_COMMAND) {//GEN-END:|7-commandAction|11|53-preAction
xml = geraXML();
//GEN-LINE:|7-commandAction|12|53-postAction
 // write post-action user code here
} else if (command == exitCommand2) {//GEN-LINE:|7-commandAction|13|57-preAction
 // write pre-action user code here
switchDisplayable (null, getPrincipal ());//GEN-LINE:|7-commandAction|14|57-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|15|7-postCommandAction
}//GEN-END:|7-commandAction|15|7-postCommandAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|16|
//</editor-fold>//GEN-END:|7-commandAction|16|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Principal ">//GEN-BEGIN:|14-getter|0|14-preInit
/**
 * Returns an initiliazed instance of Principal component.
 * @return the initialized component instance
 */
public List getPrincipal () {
if (Principal == null) {//GEN-END:|14-getter|0|14-preInit
 // write pre-init user code here
Principal = new List ("list", Choice.IMPLICIT);//GEN-BEGIN:|14-getter|1|14-postInit
Principal.append ("Inserir Dados", null);
Principal.append ("Visualizar Dados", null);
Principal.append ("Exportar Dados", null);
Principal.addCommand (getExitCommand ());
Principal.setCommandListener (this);
Principal.setSelectedFlags (new boolean[] { false, false, false });//GEN-END:|14-getter|1|14-postInit
 // write post-init user code here
}//GEN-BEGIN:|14-getter|2|
return Principal;
}
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: PrincipalAction ">//GEN-BEGIN:|14-action|0|14-preAction
/**
 * Performs an action assigned to the selected list element in the Principal component.
 */
public void PrincipalAction () {//GEN-END:|14-action|0|14-preAction
 // enter pre-action user code here
String __selectedString = getPrincipal ().getString (getPrincipal ().getSelectedIndex ());//GEN-BEGIN:|14-action|1|18-preAction
if (__selectedString != null) {
if (__selectedString.equals ("Inserir Dados")) {//GEN-END:|14-action|1|18-preAction
 // write pre-action user code here
switchDisplayable (null, getInserirDados ());//GEN-LINE:|14-action|2|18-postAction
updateTableModel();
} else if (__selectedString.equals ("Visualizar Dados")) {//GEN-LINE:|14-action|3|19-preAction

switchDisplayable (null, getVisualizarDados ());//GEN-LINE:|14-action|4|19-postAction
 // write post-action user code here
} else if (__selectedString.equals ("Exportar Dados")) {//GEN-LINE:|14-action|5|20-preAction

switchDisplayable (null, getFileBrowser ());//GEN-LINE:|14-action|6|20-postAction
//
}//GEN-BEGIN:|14-action|7|14-postAction
}//GEN-END:|14-action|7|14-postAction
 // enter post-action user code here
}//GEN-BEGIN:|14-action|8|
//</editor-fold>//GEN-END:|14-action|8|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: InserirDados ">//GEN-BEGIN:|21-getter|0|21-preInit
/**
 * Returns an initiliazed instance of InserirDados component.
 * @return the initialized component instance
 */
public Form getInserirDados () {
if (InserirDados == null) {//GEN-END:|21-getter|0|21-preInit
 // write pre-init user code here
InserirDados = new Form ("form", new Item[] { getSexo (), getDateField (), getTextField () });//GEN-BEGIN:|21-getter|1|21-postInit
InserirDados.addCommand (getSalvar ());
InserirDados.setCommandListener (this);//GEN-END:|21-getter|1|21-postInit
 // write post-init user code here
}//GEN-BEGIN:|21-getter|2|
return InserirDados;
}
//</editor-fold>//GEN-END:|21-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Sexo ">//GEN-BEGIN:|33-getter|0|33-preInit
/**
 * Returns an initiliazed instance of Sexo component.
 * @return the initialized component instance
 */
public ChoiceGroup getSexo () {
if (Sexo == null) {//GEN-END:|33-getter|0|33-preInit
 // write pre-init user code here
Sexo = new ChoiceGroup ("Sexo:", Choice.EXCLUSIVE);//GEN-BEGIN:|33-getter|1|33-postInit
Sexo.append ("Masculino", null);
Sexo.append ("Feminino", null);
Sexo.setSelectedFlags (new boolean[] { false, false });//GEN-END:|33-getter|1|33-postInit
 // write post-init user code here
}//GEN-BEGIN:|33-getter|2|
return Sexo;
}
//</editor-fold>//GEN-END:|33-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: dateField ">//GEN-BEGIN:|36-getter|0|36-preInit
/**
 * Returns an initiliazed instance of dateField component.
 * @return the initialized component instance
 */
public DateField getDateField () {
if (dateField == null) {//GEN-END:|36-getter|0|36-preInit
 // write pre-init user code here
dateField = new DateField ("Data Nascimento:", DateField.DATE);//GEN-BEGIN:|36-getter|1|36-postInit
dateField.setDate (new java.util.Date (System.currentTimeMillis ()));//GEN-END:|36-getter|1|36-postInit
 // write post-init user code here
}//GEN-BEGIN:|36-getter|2|
return dateField;
}
//</editor-fold>//GEN-END:|36-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: textField ">//GEN-BEGIN:|37-getter|0|37-preInit
/**
 * Returns an initiliazed instance of textField component.
 * @return the initialized component instance
 */
public TextField getTextField () {
if (textField == null) {//GEN-END:|37-getter|0|37-preInit
 // write pre-init user code here
textField = new TextField ("Peso:", null, 32, TextField.DECIMAL);//GEN-LINE:|37-getter|1|37-postInit
 // write post-init user code here
}//GEN-BEGIN:|37-getter|2|
return textField;
}
//</editor-fold>//GEN-END:|37-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: VisualizarDados ">//GEN-BEGIN:|23-getter|0|23-preInit
/**
 * Returns an initiliazed instance of VisualizarDados component.
 * @return the initialized component instance
 */
public Form getVisualizarDados () {
if (VisualizarDados == null) {//GEN-END:|23-getter|0|23-preInit
 // write pre-init user code here
VisualizarDados = new Form ("form", new Item[] { getTableItem () });//GEN-BEGIN:|23-getter|1|23-postInit
VisualizarDados.addCommand (getVoltar ());
VisualizarDados.setCommandListener (this);//GEN-END:|23-getter|1|23-postInit
 // write post-init user code here
}//GEN-BEGIN:|23-getter|2|
return VisualizarDados;
}
//</editor-fold>//GEN-END:|23-getter|2|



//<editor-fold defaultstate="collapsed" desc=" Generated Getter: ExportarDados ">//GEN-BEGIN:|24-getter|0|24-preInit
/**
 * Returns an initiliazed instance of ExportarDados component.
 * @return the initialized component instance
 */
public Form getExportarDados () {
if (ExportarDados == null) {//GEN-END:|24-getter|0|24-preInit
 // write pre-init user code here
ExportarDados = new Form ("Exportar Dados");//GEN-BEGIN:|24-getter|1|24-postInit
ExportarDados.addCommand (getExitCommand1 ());
ExportarDados.setCommandListener (this);//GEN-END:|24-getter|1|24-postInit
 // write post-init user code here
}//GEN-BEGIN:|24-getter|2|
return ExportarDados;
}
//</editor-fold>//GEN-END:|24-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|27-getter|0|27-preInit
/**
 * Returns an initiliazed instance of exitCommand component.
 * @return the initialized component instance
 */
public Command getExitCommand () {
if (exitCommand == null) {//GEN-END:|27-getter|0|27-preInit
 // write pre-init user code here
exitCommand = new Command ("Sair", Command.EXIT, 0);//GEN-LINE:|27-getter|1|27-postInit
 // write post-init user code here
}//GEN-BEGIN:|27-getter|2|
return exitCommand;
}
//</editor-fold>//GEN-END:|27-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Salvar ">//GEN-BEGIN:|31-getter|0|31-preInit
/**
 * Returns an initiliazed instance of Salvar component.
 * @return the initialized component instance
 */
public Command getSalvar () {
if (Salvar == null) {//GEN-END:|31-getter|0|31-preInit
 // write pre-init user code here
Salvar = new Command ("Salvar", Command.ITEM, 0);//GEN-LINE:|31-getter|1|31-postInit
 // write post-init user code here
}//GEN-BEGIN:|31-getter|2|
return Salvar;
}
//</editor-fold>//GEN-END:|31-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: itemCommand ">//GEN-BEGIN:|40-getter|0|40-preInit
/**
 * Returns an initiliazed instance of itemCommand component.
 * @return the initialized component instance
 */
public Command getItemCommand () {
if (itemCommand == null) {//GEN-END:|40-getter|0|40-preInit
 // write pre-init user code here
itemCommand = new Command ("Item", Command.ITEM, 0);//GEN-LINE:|40-getter|1|40-postInit
 // write post-init user code here
}//GEN-BEGIN:|40-getter|2|
return itemCommand;
}
//</editor-fold>//GEN-END:|40-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: Voltar ">//GEN-BEGIN:|42-getter|0|42-preInit
/**
 * Returns an initiliazed instance of Voltar component.
 * @return the initialized component instance
 */
public Command getVoltar () {
if (Voltar == null) {//GEN-END:|42-getter|0|42-preInit
 // write pre-init user code here
Voltar = new Command ("Voltar", Command.ITEM, 0);//GEN-LINE:|42-getter|1|42-postInit
 // write post-init user code here
}//GEN-BEGIN:|42-getter|2|
return Voltar;
}
//</editor-fold>//GEN-END:|42-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: tableItem ">//GEN-BEGIN:|45-getter|0|45-preInit
/**
 * Returns an initiliazed instance of tableItem component.
 * @return the initialized component instance
 */
public TableItem getTableItem () {
if (tableItem == null) {//GEN-END:|45-getter|0|45-preInit
 // write pre-init user code here
tableItem = new TableItem (getDisplay (), "Dados:");//GEN-BEGIN:|45-getter|1|45-postInit
tableItem.setModel (getSimpleTableModel ());//GEN-END:|45-getter|1|45-postInit
 // write post-init user code here
}//GEN-BEGIN:|45-getter|2|
return tableItem;
}
//</editor-fold>//GEN-END:|45-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: simpleTableModel ">//GEN-BEGIN:|46-getter|0|46-preInit
/**
 * Returns an initiliazed instance of simpleTableModel component.
 * @return the initialized component instance
 */
public SimpleTableModel getSimpleTableModel () {
if (simpleTableModel == null) {//GEN-END:|46-getter|0|46-preInit
 // write pre-init user code here
simpleTableModel = new SimpleTableModel (new java.lang.String[][] {}, new java.lang.String[] { "Sexo", "Data", "Peso" });//GEN-LINE:|46-getter|1|46-postInit
 // write post-init user code here
    updateTableModel();
}//GEN-BEGIN:|46-getter|2|
return simpleTableModel;
}
//</editor-fold>//GEN-END:|46-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|47-getter|0|47-preInit
/**
 * Returns an initiliazed instance of exitCommand1 component.
 * @return the initialized component instance
 */
public Command getExitCommand1 () {
if (exitCommand1 == null) {//GEN-END:|47-getter|0|47-preInit
 // write pre-init user code here
exitCommand1 = new Command ("Sair", Command.EXIT, 0);//GEN-LINE:|47-getter|1|47-postInit
 // write post-init user code here
}//GEN-BEGIN:|47-getter|2|
return exitCommand1;
}
//</editor-fold>//GEN-END:|47-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: fileBrowser ">//GEN-BEGIN:|51-getter|0|51-preInit
/**
 * Returns an initiliazed instance of fileBrowser component.
 * @return the initialized component instance
 */
public FileBrowser getFileBrowser () {
if (fileBrowser == null) {//GEN-END:|51-getter|0|51-preInit
 // write pre-init user code here
fileBrowser = new FileBrowser (getDisplay ());//GEN-BEGIN:|51-getter|1|51-postInit
fileBrowser.setTitle ("Exportar XML");
fileBrowser.setCommandListener (this);
fileBrowser.addCommand (FileBrowser.SELECT_FILE_COMMAND);
fileBrowser.addCommand (getExitCommand2 ());//GEN-END:|51-getter|1|51-postInit
 // write post-init user code here
}//GEN-BEGIN:|51-getter|2|
return fileBrowser;
}
//</editor-fold>//GEN-END:|51-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand2 ">//GEN-BEGIN:|56-getter|0|56-preInit
/**
 * Returns an initiliazed instance of exitCommand2 component.
 * @return the initialized component instance
 */
public Command getExitCommand2 () {
if (exitCommand2 == null) {//GEN-END:|56-getter|0|56-preInit
 // write pre-init user code here
exitCommand2 = new Command ("Sair", Command.EXIT, 0);//GEN-LINE:|56-getter|1|56-postInit
 // write post-init user code here
}//GEN-BEGIN:|56-getter|2|
return exitCommand2;
}
//</editor-fold>//GEN-END:|56-getter|2|



/**
 * Gera o tableModel para exibição dos dados já cadastrados
 */ 
private void updateTableModel() {
    Enumeration it = db.elements();
    int row = 0;
    String[][] values = new String[db.size()][3];
    while(it.hasMoreElements()){
        Hashtable obj = (Hashtable)it.nextElement();
        values[row][0] = obj.get("sexo").toString();
        values[row][1] = obj.get("data").toString();
        values[row][2] = obj.get("peso").toString();
        row++;
    }
    getSimpleTableModel().setValues(values);
}

/**
 * Salva os dados preenchidos no formulário
 */ 
 private void Save() {
           Hashtable element = new Hashtable();
           element.put("sexo",Integer.toString(Sexo.getSelectedIndex()));
           element.put("data",dateField.getDate());
           element.put("peso", textField.getString());
           db.addElement(element);
    }
 
 private String geraXML() {
     try {
         Enumeration it = db.elements();
        int row = 0;
        Document doc = new Document();
        Element raiz = doc.createElement(null, "qs");
        while(it.hasMoreElements()){
            Element q = raiz.createElement("qs", "q");
            Hashtable obj = (Hashtable)it.nextElement();
            q.setAttribute(null, "s", obj.get("sexo").toString());
            q.setAttribute(null, "d", obj.get("data").toString());
            q.setAttribute(null, "p", obj.get("peso").toString());
            raiz.addChild(row, Node.ELEMENT, q);
            row++;
        }
        doc.addChild(0, Node.ELEMENT, raiz);
        XmlSerializer serializer = new KXmlSerializer();        
        FileConnection fileConn = (FileConnection)Connector.open("file:///root1/Export.xml", Connector.READ_WRITE);
	
        if (fileConn.exists()) 
            fileConn.delete();        
        else   
            fileConn.create();
        
        OutputStream stream = fileConn.openOutputStream();
        serializer.setOutput(stream,"ascii");
        doc.write(serializer);
        stream.close();
        fileConn.close();
        return stream.toString();
     }
     catch(Exception ex){
         return ex.getMessage();
     }
     
 }

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
}
