# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

### Added
- Input validation with `@Valid` and Jakarta Bean Validation annotations on DTOs and controllers
- Additional exception handlers: `MethodArgumentNotValidException`, `HttpMessageNotReadableException`, `HttpMediaTypeNotSupportedException`, `HttpRequestMethodNotSupportedException`
- CI workflow for PR builds and tests (`.github/workflows/ci.yml`)
- `CODE_OF_CONDUCT.md` (Contributor Covenant)
- `SECURITY.md` with responsible disclosure policy
- `CHANGELOG.md` to track releases

### Changed
- Replaced `RuntimeException` with custom `SoapServiceException` across all adapters, mapper, and factory
- Added dedicated `@ExceptionHandler` for `SoapServiceException` in `GlobalExceptionHandler`
- Removed duplicate license header from `DidController.java`

### Fixed
- `"Finded Domains"` → `"Found Domains"` in `DomainController`
