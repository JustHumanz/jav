#!/bin/bash
javac $1 && java -cp $pwd: "${1%%.*}"
