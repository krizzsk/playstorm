package com.smaato.sdk.video.vast.parser;

import com.smaato.sdk.core.util.collections.Lists;
import java.util.Collections;
import java.util.List;

public final class ParseResult<Result> {
    public final List<ParseError> errors;
    public final Result value;

    private ParseResult(List<ParseError> list, Result result) {
        this.errors = list;
        this.value = result;
    }

    public static <Result> ParseResult<Result> error(String str, Exception exc) {
        return new ParseResult<>(Collections.singletonList(ParseError.buildFrom(str, exc)), (Object) null);
    }

    public static <Result> ParseResult<Result> error(ParseError parseError) {
        return new ParseResult<>(Collections.singletonList(parseError), (Object) null);
    }

    public static class Builder<Result> {
        private List<ParseError> errors;
        private Result value;

        public Builder<Result> setResult(Result result) {
            this.value = result;
            return this;
        }

        public Builder<Result> setErrors(List<ParseError> list) {
            this.errors = list;
            return this;
        }

        public ParseResult<Result> build() {
            if (this.value != null || this.errors != null) {
                return new ParseResult<>(Lists.toImmutableList(this.errors), this.value);
            }
            throw new IllegalStateException("ParseResult should contain value or list of errors at least");
        }
    }
}
