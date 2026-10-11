"""Bounded typed objects used only to collect TC for full C2S."""
OBJECT_VALUES = r'''
 static final javax.naming.directory.Attribute[] ATTRS={
  new javax.naming.directory.BasicAttribute("a",1),new javax.naming.directory.BasicAttribute("b",2),
  new javax.naming.directory.BasicAttribute("a",1)};
 static final javax.management.relation.Role[] ROLES={
  new javax.management.relation.Role("a",java.util.Collections.emptyList()),
  new javax.management.relation.Role("b",java.util.Collections.emptyList())};
 static final javax.management.relation.RoleUnresolved[] UNRESOLVED={
  new javax.management.relation.RoleUnresolved("a",java.util.Collections.emptyList(),1),
  new javax.management.relation.RoleUnresolved("b",java.util.Collections.emptyList(),2)};
 static javax.naming.directory.Attribute attribute(int s){return Math.floorMod(s,5)==0?null:ATTRS[Math.floorMod(s,ATTRS.length)];}
 static javax.management.relation.Role role(int s){return Math.floorMod(s,5)==0?null:ROLES[Math.floorMod(s,ROLES.length)];}
 static javax.management.relation.RoleUnresolved unresolved(int s){return Math.floorMod(s,5)==0?null:UNRESOLVED[Math.floorMod(s,UNRESOLVED.length)];}
 static java.util.List<javax.management.relation.Role> roles(int s){
  java.util.List<javax.management.relation.Role> a=new java.util.ArrayList<>();
  for(int i=0;i<Math.floorMod(s,6);i++)a.add(role(s+i));return a;}
 static java.util.List<javax.management.relation.RoleUnresolved> unresolveds(int s){
  java.util.List<javax.management.relation.RoleUnresolved> a=new java.util.ArrayList<>();
  for(int i=0;i<Math.floorMod(s,6);i++)a.add(unresolved(s+i));return a;}
'''
PATH_VALUES = r'''
 static final org.graphstream.graph.Graph GRAPH=new org.graphstream.graph.implementations.SingleGraph("tc");
 static {for(int i=0;i<6;i++)GRAPH.addNode("n"+i);
  for(int i=0;i<5;i++)GRAPH.addEdge("e"+i,"n"+i,"n"+(i+1));}
 static org.graphstream.graph.Edge edge(int s){return Math.floorMod(s,6)==0?null:GRAPH.getEdge(Math.floorMod(s,5));}
 static Path make(int s){Path x=new Path();int length=Math.floorMod(s,6);
  if(length>0){x.setRoot(GRAPH.getNode(0));for(int i=0;i<length-1;i++)x.add(GRAPH.getEdge(i));}return x;}
'''


def object_factory(cls):
    if cls == 'Path':
        return PATH_VALUES
    atom = {'AttributeList': 'attribute', 'RoleList': 'role', 'RoleUnresolvedList': 'unresolved'}[cls]
    return OBJECT_VALUES + f'''
 static {cls} make(int s){{{cls} x=new {cls}(16);
  for(int i=0;i<Math.floorMod(s,6);i++)x.add((Object){atom}(s+i));return x;}}
'''
