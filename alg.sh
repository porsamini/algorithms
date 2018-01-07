#!/bin/bash
while :
do
	printf "\nChoose:"
	read choice
	echo "-----------------------------------------------"
	if [ $choice != "exit" ]
	then
		java -cp out/ algorithms.$choice
	else
		exit
	fi
	echo "-----------------------------------------------"
done
