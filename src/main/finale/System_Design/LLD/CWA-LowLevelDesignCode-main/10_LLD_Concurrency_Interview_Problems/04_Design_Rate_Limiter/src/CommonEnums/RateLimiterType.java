package main.finale.System_Design.LLD.CWA;

/**
 * Enumeration of supported rate limiter types.
 */
public enum RateLimiterType {
    TOKEN_BUCKET,
    FIXED_WINDOW,
    SLIDING_WINDOW,
    LEAKY_BUCKET
}
