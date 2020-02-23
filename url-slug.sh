#!/bin/bash

function prog() {
out=`echo "$i" | java TurkishCharacterToUrl`;
}

function rename_md() {
if [ "$i" == "$out"  ]; then
:
else
mv $i $out && echo "$i --> $out";
fi
}


cd content/eylemlerimiz;
for i in *.md; do
prog;
rename_md;
done

cd ../kara-kose;
for i in *.md; do
prog;
rename_md;
done

cd ../posts;
for i in *.md; do
prog;
rename_md;
done





