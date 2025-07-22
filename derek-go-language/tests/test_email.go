package automate

import (
	"fmt"
	"regexp"
)

func IsEmail(email string) (string, error) {
	r, _ := regexp.Compile(`[\w._%+-]{1,20}@[\w.-]{2,20}.[A-Za-z]{2,3}`)
	if r.MatchString(email) {
		return "valid email", nil
	} else {
		return "", fmt.Errorf("not a valid email")
	}
}
