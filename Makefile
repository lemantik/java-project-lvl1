run: remove-build build-project run-dist

run-dist:
	./app/build/install/app/bin/app

build-project:
	./app/gradle installDist

remove-build:
	gradle clean