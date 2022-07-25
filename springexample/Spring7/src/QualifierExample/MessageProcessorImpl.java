package QualifierExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageProcessorImpl  implements MessageProcessor{
	
	private MessageService messageService;// reference object of interface
	
	
	

	public MessageService getMessageService() {
		return messageService;
	}


	/*@Autowired
	@Qualifier("TwitterService")
	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}*/



	@Autowired
	public MessageProcessorImpl(@Qualifier("TwitterService")MessageService messageService) {
		super();
		this.messageService = messageService;
	}




	@Override
	public void processMsg(String message) {
		// TODO Auto-generated method stub
		messageService.sendMsg(message);
	}

}
