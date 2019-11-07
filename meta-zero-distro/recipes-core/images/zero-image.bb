# Distro Layer configuration
# include and overwrite default poky distro
include recipes-core/images/core-image-base.bb

DESCRIPTION = "Custom image based on rpi-basic-image"

# We only need a rpi-sdimg image here
IMAGE_FSTYPES_raspberrypi0-wifi ?= "tar.bz2 rpi-sdimg"

IMAGE_FEATURES += "ssh-server-dropbear"

# Additional packages
IMAGE_INSTALL_append = " \
  wpa-supplicant \
  linux-firmware-bcm43430 \
  bash \
  boost \
  taglib \
  omxplayer \
  "

LICENSE="GPLv3"

export IMAGE_BASENAME = "zero-image"

