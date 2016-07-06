This is an example of Hot Deployment with the use of class loaders
Main purpose of this demo is to demostrate switching implementation classes while the application is in running state without any interruption
*********

	src		-> classes
	server	-> serverclasses

buildClient scenario;

	compile code on src directory and output binaries: classes

buildServer scenario;

	compile code on server directory and output binaries: serverclasses

Scenario;
*********
On command line, run the Client code as;

	class-loader-examples-iii-hot-deployment>java -cp classes com.levo.Client

Follow the steps;

	a) get quote with command 'QUOTE'
	b) switch the return message of the ServerImpl.getQuote() method
	d) run buildServer task so that hot deployment occurs, serverclass ServerImpl.class file will be updated
	d) reload server class with command 'RELOAD'
	e) get quote with command 'QUOTE' and verify that quote message has updated