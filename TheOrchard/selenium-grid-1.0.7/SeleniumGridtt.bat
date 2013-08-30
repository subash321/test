start cmd.exe 
ant launch-hub 
start cmd.exe 
ant -Denvironment=”*firefox” -Dport=5555  -DhubURL=http://localhost:4444 launch-remote-control
start cmd.exe 
ant -Denvironment=”*iehta” -Dport=5557  -DhubURL=http://localhost:4444 launch-remote-control