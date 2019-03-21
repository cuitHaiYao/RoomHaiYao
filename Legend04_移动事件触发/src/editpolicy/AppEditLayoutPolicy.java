package editpolicy;



import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.CreateRequest;

import command.AbstractLayoutCommand;
import command.EmployeeChangeLayoutCommand;
import command.ServiceChangeLayoutCommand;
import editpart.EmployeePart;
import editpart.ServicePart;


public class AppEditLayoutPolicy extends XYLayoutEditPolicy {

	@Override
	protected Command createChangeConstraintCommand(EditPart child,
			Object constraint) {
		// TODO Auto-generated method stub
		
		AbstractLayoutCommand command = null;
		
		if(child instanceof EmployeePart) {
			command = new EmployeeChangeLayoutCommand();
		} else if(child instanceof ServicePart) {
			command = new ServiceChangeLayoutCommand();
		}
		
		command.setModel(child.getModel());
		command.setConstraint((Rectangle)constraint);
		return command;
	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
