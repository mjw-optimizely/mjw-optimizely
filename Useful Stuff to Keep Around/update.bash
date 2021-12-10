#!/bin/bash

# Progression is dev -> cloud-rc -> cloud-release. Code in dev eventually ends up in cloud-rc and
# then cloud-release; code in cloud-rc eventually ends up in cloud-release. 

pushd insite-commerce

for branch in cloud-release cloud-rc dev
do
  git checkout $branch
  git pull
done

popd