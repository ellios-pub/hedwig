package me.ellios.hedwig.memcached.resource.args.parser;

import me.ellios.hedwig.memcached.resource.args.ArgParser;

/**
 * string parser.
 *
 * @author gaofeng
 * @since: 14-3-20
 */
public class StringParser implements ArgParser {

    @Override
    public Object parse(String value) {
        return value;
    }
}
