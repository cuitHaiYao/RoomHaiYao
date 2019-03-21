package legend;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.ui.parts.GraphicalEditor;

import editpart.AppEditPartFactory;
import model.Employee;
import model.Enterprise;
import model.Service;

public class MyGraphicalEditor extends GraphicalEditor {
	
	public static final String ID = "LEGEND.mygraphicaleditor";
	public MyGraphicalEditor() {
		setEditDomain(new DefaultEditDomain(this));
	}
	
	
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		GraphicalViewer viewer = getGraphicalViewer();
		viewer.setEditPartFactory(new AppEditPartFactory());
	}

	@Override
	protected void initializeGraphicalViewer() {
		// TODO Auto-generated method stub
				GraphicalViewer viewer = getGraphicalViewer();
				viewer.setContents(CreateEnterprise());

	}
	
	public Enterprise CreateEnterprise() {
Enterprise enterprise = new Enterprise();
		
		enterprise.setName("Í¬¸£¿ÍÕ»");
		enterprise.setAddress("Î÷ÈÞÏßºúÍ¬ÆßºÅ");
		enterprise.setCapital(8000000);
		
			Service service_QianTang = new Service();
			service_QianTang.setName("Ç°ÌÃ");
			service_QianTang.setEtage(2);
			service_QianTang.setLayout(new Rectangle(30,50,250,150));
			
				Employee empolyee_1 = new Employee();
				empolyee_1.setName("ÕÆ¹ñ");
				empolyee_1.setPrenom("Ù¡");
				empolyee_1.setLayout(new Rectangle(25,40,60,40));
				service_QianTang.addChild(empolyee_1);
				
				Employee empolyee_2 = new Employee();
				empolyee_2.setName("Õ¹ÌÃ");
				empolyee_2.setPrenom("°×");
				empolyee_2.setLayout(new Rectangle(100,60,60,40));
				service_QianTang.addChild(empolyee_2);				
				
				Employee empolyee_3 = new Employee();
				empolyee_3.setName("Ðã²Å");
				empolyee_3.setPrenom("ÂÀ");
				empolyee_3.setLayout(new Rectangle(180,90,60,40));
				service_QianTang.addChild(empolyee_3);				
				
			enterprise.addChild(service_QianTang);
			
			Service service_HouChu = new Service();
			service_HouChu.setName("ºó³ø");
			service_HouChu.setEtage(1);
			service_HouChu.setLayout(new Rectangle(220,230,250,150));
			
				Employee employee_4 = new Employee();
				employee_4.setName("´ó×ì");
				employee_4.setPrenom("Àî");
				employee_4.setLayout(new Rectangle(40,70,60,40));
				service_HouChu.addChild(employee_4);
				
				Employee employee_5 = new Employee();
				employee_5.setName("Ü½ÈØ");
				employee_5.setPrenom("¹ù");
				employee_5.setLayout(new Rectangle(170,100,60,40));
				service_HouChu.addChild(employee_5);
				
			enterprise.addChild(service_HouChu);
		
		return enterprise;
		
		/*
		 * Enterprise enterprise = new Enterprise();
		 * enterprise.setName("Weapon Workshop");
		 * enterprise.setAddress("Rd ChangAn No.1"); enterprise.setCapital(8000000);
		 * return enterprise;
		 */
	}

	@Override
	public void doSave(IProgressMonitor arg0) {
		// TODO Auto-generated method stub

	}
	
	
	
	
	public static void main(String[] args) {
		
	}
	
}
