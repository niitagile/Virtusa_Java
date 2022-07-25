package ac;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import QualifierExample.*;
@Configuration
@ComponentScan("QualifierExample")
public class ApplicationConfiguration {
		@Bean(name="emailService")
		public MessageService emailService() {
			return new EmailService();
		}
		@Bean(name="smsService")
		public MessageService smsService() {
			return new SmsService();
		}
		@Bean(name="twitterService")
		public MessageService twitterService() {
			return new TwitterService();
		}
		
		@Bean
		public MessageProcessor messageProcessor() {
			return new MessageProcessorImpl(twitterService());
		}
		
}
