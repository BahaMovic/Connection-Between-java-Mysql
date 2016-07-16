package test2;

import java.util.Arrays;

public class NodeList {
char node ;
NodeList next;
NodeList before;

public NodeList(NodeList next , char node , NodeList before){
	this.node= node;
	this.next = next;
	this.before = before;
}
}
