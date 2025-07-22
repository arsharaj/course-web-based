package automate

import "testing"

func TestIsEmail(t *testing.T) {
	_, err := IsEmail("hello")
	if err == nil {
		t.Error("hello is not an email")
	}
	_, err = IsEmail("hello@test.com")
	if err != nil {
		t.Error("hello@test.com is an email")
	}
	_, err = IsEmail("hello@test")
	if err == nil {
		t.Error("hello@test is not an email")
	}
}
