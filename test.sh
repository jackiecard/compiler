#! /bin/zsh

export CLASSPATH=".:$HOME/.local/lib/antlr-4.8-complete.jar:$CLASSPATH"
alias antlr4='java -Xmx500M -cp "$CLASSPATH" org.antlr.v4.Tool'
alias grun='java -Xmx500M -cp "$CLASSPATH" org.antlr.v4.gui.TestRig'

antlr4 exemplo.g4 -o build
cd build
javac *.java
grun exemplo start -gui < ../input.txt
