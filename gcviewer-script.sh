#!/bin/bash
set -ev
echo "TRAVIS_PULL_REQUEST = ${TRAVIS_PULL_REQUEST}"
echo "TRAVIS_BRANCH = ${TRAVIS_BRANCH}"
if [ "${TRAVIS_PULL_REQUEST}" = "false" ] && [ "${TRAVIS_BRANCH}" = "develop" ]
then
  echo build and deploy
  mvn clean deploy javadoc:javadoc -P sourceforge-release --settings ./target/travis/settings.xml
else
  echo only verify
  mvn clean verify javadoc:javadoc
fi
